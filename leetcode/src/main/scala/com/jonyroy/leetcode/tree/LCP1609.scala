package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.TreeNode

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 *
 * https://leetcode.com/problems/even-odd-tree/
 */
object LCP1609 {
  def isEvenOddTree(root: TreeNode): Boolean = {
    val q = scala.collection.mutable.Queue[TreeNode]()
    q.enqueue(root)

    var isLevelEven: Boolean = true

    while (q.nonEmpty) {
      val qSize = q.size
      var preVal = if (isLevelEven) Integer.MIN_VALUE else Integer.MAX_VALUE
      for (_ <- 0 until qSize) {
        val node = q.dequeue()
        if (isLevelEven && (node.value % 2 == 0 || node.value <= preVal)) return false
        if (!isLevelEven && (node.value % 2 == 1 || node.value >= preVal)) return false
        preVal = node.value
        if (node.left != null) q.enqueue(node.left)
        if (node.right != null) q.enqueue(node.right)
      }
      isLevelEven = !isLevelEven
    }
    true
  }
}
