package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.TreeNode

import scala.annotation.tailrec

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 *
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
object LCP700 {

  @tailrec
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root != null && root.value == `val`) return root
    else if (root != null && root.value < `val`) searchBST(root.right, `val`)
    else if (root != null && root.value > `val`) searchBST(root.left, `val`)
    else null
  }

}
