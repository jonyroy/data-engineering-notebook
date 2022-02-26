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
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
object LCP404 {

  def sumOfLeftLeaves(root: TreeNode): Int = {
    def leftLeavesSum(root: TreeNode, isLeft: Boolean): Int = {
      if (root == null) return 0
      if (root.left == null && root.right == null) {
        if (isLeft) return root.value else return 0
      }
      leftLeavesSum(root.left, isLeft = true) + leftLeavesSum(root.right, isLeft = false)
    }
    leftLeavesSum(root, isLeft = false)
  }

}
