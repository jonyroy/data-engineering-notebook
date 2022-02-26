package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP111Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return minimum Depth of Binary Tree" in {
    val input = Array(Some(3), Some(9), Some(20), None, None, Some(15), Some(7))
    val inputTree = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = LCP111.minDepth(inputTree)

    val input2 = Array(Some(2), None, Some(3), None, Some(4), None, Some(5), None, Some(7))
    val inputTree2 = LeetCodeCommon.constructBinaryTree(input2, 0, input2.length)
    val output2 = LCP111.minDepth(inputTree2)

    LCP111.minDepth(null) should be(0)
    output should be(2)
    output2 should be(5)
  }

}
