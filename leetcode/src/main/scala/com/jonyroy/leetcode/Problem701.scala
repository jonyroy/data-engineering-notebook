package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.TreeNode

import scala.collection.immutable.TreeMap

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 *
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */
object Problem701 {
  def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null) {
      return TreeNode(`val`, null, null)
    } else if (`val` < root.value) {
      root.left = insertIntoBST(root.left, `val`)
    } else if (`val` > root.value) {
      root.right = insertIntoBST(root.right, `val`)
    }
    root
  }
}
