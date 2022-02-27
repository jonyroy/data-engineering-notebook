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
 * https://leetcode.com/problems/path-sum/
 */
object LCP112 {
  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    def hasPathSum(root: TreeNode, targetSum: Int, currentSum: Int): Boolean = {
      if (root != null && root.left == null && root.right == null) {
        if (currentSum + root.value == targetSum) return true else return false
      }
      if (root == null) return false
      val left = hasPathSum(root.left, targetSum, currentSum + root.value)
      val right = hasPathSum(root.right, targetSum, currentSum + root.value)
      left || right
    }
    hasPathSum(root, targetSum, 0)
  }
}
