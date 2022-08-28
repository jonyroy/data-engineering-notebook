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
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
object LCP103 {
  def zigzagLevelOrder(root: TreeNode): List[List[Int]] = {

    if (root == null) return List.empty

    val result = scala.collection.mutable.ArrayBuffer[List[Int]]()
    val q = scala.collection.mutable.Queue[TreeNode]()
    q.enqueue(root)

    var isLevelEven: Boolean = true

    while (q.nonEmpty) {
      val qSize = q.size
      val levelNodes = scala.collection.mutable.ArrayBuffer[Int]()
      for (_ <- 0 until qSize) {
        val node = q.dequeue()
        levelNodes += node.value

        if (node.left != null) q.enqueue(node.left)
        if (node.right != null) q.enqueue(node.right)
      }

      if (isLevelEven) result.append(levelNodes.toList) else result.append(levelNodes.reverse.toList)

      isLevelEven = !isLevelEven
    }
    result.toList
  }
}
