package io.kafka.custom.serde
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

case class Address(house: String, street: String)
case class Person(firstName: String, lastName: String, address: Address)

class KafkaCustomSerdeSuite extends AnyFunSuite with Matchers {

  test("Simple Kafka Custom Serde Test") {
    val input = Person("Jony", "Roy", Address("Dhaka", "Bangladesh"))
    val personCustomSerde = new KafkaCustomSerde[Person]
    val personSerialized = personCustomSerde.serializer().serialize("dummy_topic", input)
    val output = personCustomSerde.deserializer().deserialize("dummy_topic", personSerialized)
    output shouldBe input
  }

  test("Simple Kafka Custom List Object Serde Test") {
    val input = List(
      Person("Jony", "Roy", Address("Dhaka", "Bangladesh")),
      Person("Shivazi", "Biswas", Address("Dhaka", "Bangladesh")))

    val personCustomSerde = new KafkaCustomSerde[List[Person]]
    val personSerialized = personCustomSerde.serializer().serialize("dummy_topic", input)
    val output = personCustomSerde.deserializer().deserialize("dummy_topic", personSerialized)
    output shouldBe input
  }

}
