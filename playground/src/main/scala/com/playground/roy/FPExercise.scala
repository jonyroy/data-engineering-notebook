package com.playground.roy

object FPExercise {

}

trait Json
final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumber(get: Double) extends Json
case object JsNull extends Json

trait JsonWriter[A] {
  def write(value: A): Json
}

case class Person(name: String, email: String)

object JsonWriterInstances {
  implicit val stringWriter: JsonWriter[String] = new JsonWriter[String] {
    override def write(value: String): Json = JsString(value)
  }

  implicit val personWriter: JsonWriter[Person] = new JsonWriter[Person] {
    override def write(value: Person) = JsObject(Map(
      "name" → JsString(value.name),
      "email" → JsString(value.email)
    ))
  }
}

object JsonSyntax {
  implicit class JsonWriterOps[A](value: A) {
    def toJson(implicit w: JsonWriter[A]): Json = w.write(value)
  }
}

object Json {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json = w.write(value)
}

object PlayGround extends App {

  import JsonSyntax.JsonWriterOps
  import JsonWriterInstances.personWriter
  println(Json.toJson(Person("Jony Roy", "jonyroyice@gmail.com"))(JsonWriterInstances.personWriter))
  println(Person("Jony Roy", "jonyroyice@gmail.com").toJson)
}

