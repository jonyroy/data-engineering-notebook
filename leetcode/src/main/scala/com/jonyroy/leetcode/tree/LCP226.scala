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
 * https://leetcode.com/problems/invert-binary-tree/
 */
object LCP226 {
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) return null
    val left = invertTree(root.left)
    val right = invertTree(root.right)
    TreeNode(root.value, right, left)
  }
}
