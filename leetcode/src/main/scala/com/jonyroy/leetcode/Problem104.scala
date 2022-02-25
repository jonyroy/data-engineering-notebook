package com.jonyroy.leetcode

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

object Problem104 {
  def maxDepth(root: TreeNode): Int = {

    def _maxDepth(root: TreeNode, depth: Int): Int = {
      if (root == null && depth == 1) return 0
      else if(root == null) return depth
      val leftDepth = if(root.left != null) _maxDepth(root.left, depth + 1) else depth
      val rightDepth = if(root.right != null) _maxDepth(root.right, depth + 1) else depth
      scala.math.max(leftDepth, rightDepth)
    }

    _maxDepth(root, 1)
  }
}
