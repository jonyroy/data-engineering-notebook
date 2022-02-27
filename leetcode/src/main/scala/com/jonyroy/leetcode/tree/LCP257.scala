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
 * https://leetcode.com/problems/binary-tree-paths/
 */
object LCP257 {
  def binaryTreePaths(root: TreeNode): List[String] = {

    def findPaths(root: TreeNode, path: List[String]): List[String] = {
      if (root != null && root.left == null && root.right == null) {
        return List((root.value.toString :: path).reverse.mkString("->"))
      }

      if (root == null) return List.empty[String]

      val leftPaths = findPaths(root.left, root.value.toString :: path)
      val rightPaths = findPaths(root.right, root.value.toString :: path)
      leftPaths ++ rightPaths
    }

    findPaths(root, List.empty)
  }
}
