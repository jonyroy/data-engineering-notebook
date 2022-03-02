package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP1302Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "be able to return deepest leaves Sum" in {
    val root = lcBinaryTree(Array(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))
    val root1 = lcBinaryTree(Array(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
    val output = LCP1302.deepestLeavesSum(root)
    val output1 = LCP1302.deepestLeavesSum(root1)
    output should be(15)
    output1 should be(19)
  }
}
