package com.jonyroy.leetcode

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
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
object Problem1022 {

  def sumRootToLeaf(root: TreeNode): Int = {

    def _sumRootToLeaf(root: TreeNode, path: List[Int]): Int = {
      if(root != null && root.left == null && root.right == null) {
        return binaryToDecimal(root.value :: path)
      }

      if(root == null) return 0

      _sumRootToLeaf(root.left, root.value :: path) + _sumRootToLeaf(root.right, root.value :: path)
    }

    def binaryToDecimal(path: List[Int]): Int = {
      path.zipWithIndex.map { case (item, index) ⇒ scala.math.pow(2, index) * item}.sum.toInt
    }

    _sumRootToLeaf(root, List[Int]())
  }

}
