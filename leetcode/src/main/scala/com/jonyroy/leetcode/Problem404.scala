package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.TreeNode

object Problem404 {

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
