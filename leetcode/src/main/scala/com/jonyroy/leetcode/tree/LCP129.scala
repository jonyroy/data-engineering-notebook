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
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
object LCP129 {

  def sumNumbers(root: TreeNode): Int = {

    def sumNumbers(root: TreeNode, path: String): Int = {
      if (root != null && root.left == null && root.right == null) return (path + root.value.toString).toInt
      if (root == null) return 0
      val leftResult = sumNumbers(root.left, path + root.value.toString)
      val rightResult = sumNumbers(root.right, path + root.value.toString)
      leftResult + rightResult
    }

    sumNumbers(root, "")
  }
}
