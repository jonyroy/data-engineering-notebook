package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.{LeetCodeCommon, TreeNode}
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem104Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return maximum Depth of Binary Tree" in {
    val input = Array(Some(3), Some(9), Some(20), None, None, Some(15), Some(7))
    val inputTree = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = Problem104.maxDepth(inputTree)

    Problem104.maxDepth(null) should be(0)
    output should be(3)
  }

}
