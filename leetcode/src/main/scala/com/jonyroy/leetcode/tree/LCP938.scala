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
 * https://leetcode.com/problems/range-sum-of-bst/
 */
object LCP938 {
  def rangeSumBST(root: TreeNode, low: Int, high: Int): Int = {
    def evaluateRangeSum(root: TreeNode): Int = {
      if (root == null) return 0
      if (root.left == null && root.right == null) {
        if (root.value >= low && root.value <= high) return root.value else return 0
      }
      val value = if (root.value >= low && root.value <= high) root.value else 0
      evaluateRangeSum(root.left) + value + evaluateRangeSum(root.right)
    }

    evaluateRangeSum(root)
  }
}
