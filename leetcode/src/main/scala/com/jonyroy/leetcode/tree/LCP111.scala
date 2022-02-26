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
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
object LCP111 {

  def minDepth(root: TreeNode): Int = {

    def _minDepth(root: TreeNode, depth: Int): Int = {
      if (root == null) return depth - 1
      if (root.left == null) _minDepth(root.right, depth + 1) else 0
      val leftDepth = _minDepth(root.left, depth + 1)
      val rightDepth = _minDepth(root.right, depth + 1)
      scala.math.min(leftDepth, rightDepth)
    }

    _minDepth(root, 1)
  }
}
