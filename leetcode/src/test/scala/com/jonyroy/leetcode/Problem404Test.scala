package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.LeetCodeCommon
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem404Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return sum of left leaves" in {
    val input = Array(Some(3), Some(9), Some(20), None, None, Some(15), Some(7))
    val inputTree = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = Problem404.sumOfLeftLeaves(inputTree)
    output should be(24)
  }

}
