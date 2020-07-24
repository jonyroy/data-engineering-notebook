from airflow import DAG

from airflow.operators.bash_operator import BashOperator
from airflow.operators.python_operator import PythonOperator

from airflow.utils.dates import days_ago

default_args = {
    "owner": "airflow",
    "depends_on_past": False,
    "start_day": days_ago(2),
    "email": ["jonyroy@varnertech.no"],
    "email_on_failure": False,
    "email_on_retry": False,
}

dag = DAG(
    dag_id="testing",
    description="simple test",
    default_args=default_args,
    schedule_interval="*/1 * * * *",
)


def write_to_file():
    with open("~/airflow-write.txt", "w") as f:
        f.write("hello world")


t1 = BashOperator(
    task_id="print_date", bash_command="date", start_date=days_ago(1), dag=dag
)

t2 = PythonOperator(task_id="writing_file", start_date=days_ago(1), python_callable=write_to_file, dag=dag)

t1 >> t2