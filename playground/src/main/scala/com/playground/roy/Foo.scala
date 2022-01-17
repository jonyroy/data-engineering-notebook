package com.playground.roy

class Foo {
  private[this] def isFoo: Boolean = true

  def doFoo(otherFoo: Foo): Unit = {
    if(otherFoo.isFoo) {
      println("IsFoo is accessible")
    } else {
      println("IsFoo is not accessible")
    }
  }
}


object FooApp extends App {
  val foo = new Foo()
  val otherFoo = new Foo()
  foo.doFoo(otherFoo)
}