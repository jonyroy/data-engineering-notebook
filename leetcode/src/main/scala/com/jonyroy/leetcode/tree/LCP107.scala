package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.TreeNode

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
object LCP107 {

  def levelOrderBottom(root: TreeNode): List[List[Int]] = {
    if (root == null) return List.empty
    val q = scala.collection.mutable.Queue[TreeNode]()
    val result = scala.collection.mutable.ListBuffer[List[Int]]()
    q.enqueue(root)
    while (q.nonEmpty) {
      val qSize = q.size
      val levelNodes = scala.collection.mutable.ArrayBuffer[Int]()
      for (_ <- 0 until qSize) {
        val node = q.dequeue()
        levelNodes.append(node.value)
        if (node.left != null) q.enqueue(node.left)
        if (node.right != null) q.enqueue(node.right)
      }
      result.prepend(levelNodes.toList)
    }
    result.toList
  }

}
