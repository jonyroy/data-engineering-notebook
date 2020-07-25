package io.kafka.custom.serde

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.{ Map => JMap }

import org.apache.kafka.common.serialization.Deserializer
import org.apache.kafka.common.serialization.Serde
import org.apache.kafka.common.serialization.Serializer

import scala.reflect.ClassTag

class KafkaCustomSerde[T: ClassTag] extends Serde[T] {
  override def configure(configs: JMap[String, _], isKey: Boolean): Unit = {}
  override def serializer(): Serializer[T] = new KafkaCustomSerializer[T]
  override def deserializer(): Deserializer[T] = new KafkaCustomDeserializer[T]
  override def close(): Unit = {}
}

class KafkaCustomSerializer[T: ClassTag] extends Serializer[T] {

  override def serialize(topic: String, data: T): Array[Byte] = {
    val stream: ByteArrayOutputStream = new ByteArrayOutputStream()
    val oos = new ObjectOutputStream(stream)
    oos.writeObject(data)
    oos.close()
    stream.toByteArray
  }

  override def configure(configs: JMap[String, _], isKey: Boolean): Unit = {}

  override def close(): Unit = {}
}

class KafkaCustomDeserializer[T: ClassTag] extends Deserializer[T] {
  override def configure(configs: JMap[String, _], isKey: Boolean): Unit = {}

  override def deserialize(topic: String, data: Array[Byte]): T = {
    val objIn = new ObjectInputStream(new ByteArrayInputStream(data))
    val obj = objIn.readObject().asInstanceOf[T]
    objIn.close()
    obj
  }

  override def close(): Unit = {}
}
