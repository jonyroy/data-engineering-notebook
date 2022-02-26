package com.jonyroy.leetcode.common

case class Tree(value: Int, var left: Option[Tree], var right: Option[Tree])
case class TreeNode(value: Int, var left: TreeNode, var right: TreeNode)

object LeetCodeCommon {

  def constructBinaryTree(arr: Array[Option[Int]], currentIndex: Int, numOfNodes: Int): TreeNode = {
    if (currentIndex >= numOfNodes || arr(currentIndex).isEmpty) return null
    var counter = 0
    for (item ← 0 to currentIndex) {
      if (arr(item).isEmpty) counter += 1
    }
    val childrenIndex = 2 * (currentIndex - counter)
    val left = constructBinaryTree(arr, childrenIndex + 1, numOfNodes)
    val right = constructBinaryTree(arr, childrenIndex + 2, numOfNodes)
    TreeNode(arr(currentIndex).get, left, right)
  }

  def lcBinaryTree(lcInput: Array[Any]): TreeNode = {
    val input: Array[Option[Int]] = convertLeetCodeArray(lcInput)
    constructBinaryTree(input, 0, lcInput.length)
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
