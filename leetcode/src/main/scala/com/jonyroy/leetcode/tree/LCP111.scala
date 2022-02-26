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
    if(root == null) return 0
    val leftDepth = minDepth(root.left)
    val rightDepth = minDepth(root.right)
    if (leftDepth == 0 || rightDepth == 0) leftDepth + rightDepth + 1
    else scala.math.min(leftDepth, rightDepth) + 1
  }
}
