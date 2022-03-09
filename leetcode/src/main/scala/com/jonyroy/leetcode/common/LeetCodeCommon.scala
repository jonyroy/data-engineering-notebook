package com.jonyroy.leetcode.common

case class TreeNode(var value: Int, var left: TreeNode, var right: TreeNode)

case class ListNode(var x: Int, var next: ListNode)

object LeetCodeCommon {

  def buildBinaryTree(arr: Array[Option[Int]], currentIndex: Int, numOfNodes: Int): TreeNode = {
    if (currentIndex >= numOfNodes || arr(currentIndex).isEmpty) return null
    var counter = 0
    for (item <- 0 to currentIndex) {
      if (arr(item).isEmpty) counter += 1
    }
    val childrenIndex = 2 * (currentIndex - counter)
    val left = buildBinaryTree(arr, childrenIndex + 1, numOfNodes)
    val right = buildBinaryTree(arr, childrenIndex + 2, numOfNodes)
    TreeNode(arr(currentIndex).get, left, right)
  }

  def lcBinaryTree(lcInput: Array[Any]): TreeNode = {
    val input: Array[Option[Int]] = convertLeetCodeArray(lcInput)
    buildBinaryTree(input, 0, lcInput.length)
  }

  def convertLeetCodeArray(arr: Array[Any]): Array[Option[Int]] = {
    arr.map(elem => if (elem == null) None else Option(elem.asInstanceOf[Int]))
  }

  def convertTreeToArray(root: TreeNode): Array[Option[Int]] = {
    import scala.collection.mutable
    val queue = new mutable.Queue[TreeNode]()
    val acc = mutable.MutableList[Option[Int]]()
    queue.enqueue(root)
    while (queue.nonEmpty) {
      val currentNode = queue.dequeue()
      if (currentNode != null) {
        acc += Some(currentNode.value)
        queue.enqueue(currentNode.left)
        queue.enqueue(currentNode.right)
      } else {
        acc += None
      }
    }
    acc.toArray
  }
}
