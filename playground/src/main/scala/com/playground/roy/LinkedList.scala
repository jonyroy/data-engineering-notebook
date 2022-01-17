package com.playground.roy

case class LinkedList(value: Int, nextNode: LinkedList)

class Linked() {}

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}
object Solution {
  def goodNodes(root: TreeNode): Int = {
    0
  }

  goodNodes(new TreeNode())
}

object LinkedListApp extends App {

  def minFlips(target: String): Int = {
    var counter: Int = 0
    var status: Char = '0'
    for (i <- target) {
      if (counter == 0 && i == '0') {} else {
        if (status != i) {
          counter += 1
          status = if (status == '0') '1' else '0'
        }
      }
    }
    counter
  }

  println(minFlips("10111"))

//  var nextNode = LinkedList(1, LinkedList(2, null))
//
//  while (nextNode != null) {
//    println(nextNode.value)
//
//    nextNode = nextNode.nextNode
//  }
}
