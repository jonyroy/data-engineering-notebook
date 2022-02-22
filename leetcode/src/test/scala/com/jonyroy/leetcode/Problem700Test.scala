package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.{LeetCodeCommon, TreeNode}
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem700Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Search in a Binary Search Tree" in {
    val input: Array[Option[Int]] = Array(Some(4), Some(2), Some(7), Some(1), Some(3))
    val inputTree = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = Problem700.searchBST(inputTree, 2)
    val output2 = Problem700.searchBST(inputTree, 8)

    output should be(TreeNode(2,TreeNode(1,null,null),TreeNode(3,null,null)))
    output2 should be(null)
  }
}
