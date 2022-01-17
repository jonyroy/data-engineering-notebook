package com.playground.roy

import scalaz.Scalaz._
import scalaz._

import scala.annotation.tailrec
import scala.util.Try

object PlayGroundMain {
  def main(args: Array[String]): Unit = {

    val len: String => Int = _.length

    val y = Some("1").map(len)

    val l = Functor[Option].map(Some(1.toString))(len)


      @tailrec
      def factorialTail(acc: Int, n: Int): Int = {
        if (n <= 1) acc
        else factorialTail(n * acc, n - 1)
      }


      def factorialRecursion(n: Int): Int = {
        if (n <= 1) 1
        else n * factorialRecursion(n - 1)
      }

    val x = Try {
      3
    }

    List


    println(factorialTail(1, 5) == factorialRecursion(5))

  }
}
