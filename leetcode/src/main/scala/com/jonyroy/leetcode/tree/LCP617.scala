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
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
object LCP617 {
  def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {
    if (root1 == null) return root2
    if (root2 == null) return root1
    val left = mergeTrees(root1.left, root2.left)
    val right = mergeTrees(root1.right, root2.right)
    TreeNode(root1.value + root2.value, left, right)
  }
}
