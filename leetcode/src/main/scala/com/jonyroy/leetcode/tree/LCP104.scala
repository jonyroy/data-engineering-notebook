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
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
object LCP104 {
  def maxDepth(root: TreeNode): Int = {

    def _maxDepth(root: TreeNode, depth: Int): Int = {
      if (root == null) return depth - 1
      val leftDepth = _maxDepth(root.left, depth + 1)
      val rightDepth = _maxDepth(root.right, depth + 1)
      scala.math.max(leftDepth, rightDepth)
    }

    _maxDepth(root, 1)
  }
}
