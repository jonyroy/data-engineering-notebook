package com.jonyroy.leetcode.common

case class Tree(value: Int, var left: Option[Tree], var right: Option[Tree])
case class TreeNode(value: Int, var left: TreeNode, var right: TreeNode)

object LeetCodeCommon {

  def constructBinaryTree(arr: Array[Option[Int]], currentIndex: Int, numOfNodes: Int): TreeNode = {
    if (currentIndex < numOfNodes) {
      if (arr(currentIndex).isEmpty) {
        null
      } else {
        val tree = TreeNode(arr(currentIndex).get, null, null)
        tree.left = constructBinaryTree(arr, 2 * currentIndex + 1, numOfNodes)
        tree.right = constructBinaryTree(arr, 2 * currentIndex + 2, numOfNodes)
        tree
      }
    } else {
      null
    }
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
