package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP404Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return sum of left leaves" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val output = LCP404.sumOfLeftLeaves(root)
    output should be(24)
  }

}
