package com.playground.roy

trait BSTree[+A] {
  def value: Option[A] = this match {
    case n: Node[A] => Some(n.v)
    case l: Leaf[A] => Some(l.v)
    case Empty      => None
  }

  def left: Option[BSTree[A]] = this match {
    case n: Node[A] => Some(n.l)
    case l: Leaf[A] => None
    case Empty      => None
  }

  def right: Option[BSTree[A]] = this match {
    case n: Node[A] => Some(n.r)
    case l: Leaf[A] => None
    case Empty      => None
  }
}

case class Node[A](v: A, l: BSTree[A], r: BSTree[A]) extends BSTree[A]
case class Leaf[A](v: A) extends BSTree[A]
case object Empty extends BSTree[Nothing]