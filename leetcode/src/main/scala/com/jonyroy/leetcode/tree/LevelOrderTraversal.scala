package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.TreeNode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object LevelOrderTraversal {

  def getNodesByLevel(root: TreeNode): ArrayBuffer[ArrayBuffer[Int]] = {
    val levelNodes = ArrayBuffer[ArrayBuffer[Int]]()
    val q = mutable.Queue[TreeNode]()
    if (root == null) return levelNodes
    q.enqueue(root)
    while (q.nonEmpty) {
      val qSize = q.size
      val acc = ArrayBuffer[Int]()
      for (_ <- 0 until qSize) {
        val currentNode = q.dequeue()
        acc += currentNode.value
        if (currentNode.left != null) q.enqueue(currentNode.left)
        if (currentNode.right != null) q.enqueue(currentNode.right)
      }
      levelNodes += acc
    }
    levelNodes
  }

}
