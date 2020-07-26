Following commands are for below versions
=========================================
``` 
Google Cloud SDK 302.0.0
alpha 2020.07.17
beta 2020.07.17
bq 2.0.58
core 2020.07.17
gsutil 4.52
kubectl 1.15.11
pubsub-emulator 0.1.0
```

Google Cheat Sheet
==================
``` 
gcloud cheat-sheet
```

Credentials
=========
### Login into Google Cloud
``` 
gcloud auth login
gcloud auth application-default login
```
### List all credentialed accounts
``` 
gcloud auth list
```
### Display the current account's access token
``` 
gcloud auth print-access-token
```
### Remove access credentials for an account
``` 
gcloud auth revoke
```

Configuration
=============
### Show Google Cloud Config
``` 
gcloud config list
```
### Set Google Cloud Project Account
```
gcloud config set account <account_name>
```
### Set Google Cloud Project
```
gcloud config set project <project_id>
```
### Unset Google Cloud Account
```
gcloud config unset account
```
### Unset Google Cloud Project
```
gcloud config unset project
```

Google Compute
==============
### Get All Compute Images List
``` 
gcloud compute images list
```
### Get All Compute Machine Types
``` 
gcloud compute machine-types list
```
### Get All Zones List
``` 
gcloud compute zones list
```
### Start Google Cloud Instances
``` 
gcloud compute instances start <instance_names> --zone=<zone_name>
```

Google Cloud Monitoring
=======================
### Inspect Channels Info
``` 
gcloud beta monitoring channels list --project=<insert_project_id_here>
```
### Monitoring Dashboard List
```
gcloud monitoring dashboards list
```
### See supported channel names
```
gcloud beta monitoring channel-descriptors list --format='value(type)' --project=<insert_project_id_here>
```

Google Kubernetes Engine
===
### Set GKE Project
``` 
gcloud container clusters get-credentials <project_name> --zone <project_zone> --project <project_id>
```

For full set of commands
========================
[gcloud sdk reference](https://cloud.google.com/sdk/gcloud/reference)