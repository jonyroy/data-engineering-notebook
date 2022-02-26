package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.jonyroy.leetcode.common.TreeNode
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP700Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Search in a Binary Search Tree" in {
    val root = lcBinaryTree(Array(4, 2, 7, 1, 3))
    val output = LCP700.searchBST(root, 2)
    val output2 = LCP700.searchBST(root, 8)

    output should be(TreeNode(2, TreeNode(1, null, null), TreeNode(3, null, null)))
    output2 should be(null)
  }
}
