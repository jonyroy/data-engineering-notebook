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
 * https://leetcode.com/problems/path-sum-ii/
 */
object LCP113 {

  def pathSum(root: TreeNode, targetSum: Int): List[List[Int]] = {

    def findPathSum(root: TreeNode, targetSum: Int, currentSum: Int, paths: List[Int]): List[List[Int]] = {

      if (root != null && root.left == null && root.right == null) {
        if (currentSum + root.value == targetSum) return List((root.value :: paths).reverse) else return List.empty
      }

      if (root == null) return List.empty

      val left = findPathSum(root.left, targetSum, currentSum + root.value, root.value :: paths)
      val right = findPathSum(root.right, targetSum, currentSum + root.value, root.value :: paths)

      left ++ right
    }

    findPathSum(root, targetSum, 0, List.empty)
  }
}
