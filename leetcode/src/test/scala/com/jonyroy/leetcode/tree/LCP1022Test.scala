package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP1022Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "be able to sum of root To leaf binary numbers" in {
    val root = lcBinaryTree(Array(1, 0, 1, 0, 1, 0, 1))
    val output = LCP1022.sumRootToLeaf(root)
    output should be(22)
  }
}
