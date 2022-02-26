package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP1022Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Sum of Root To Leaf Binary Numbers" in {

    val input = Array[Option[Int]](Some(1), Some(0), Some(1), Some(0), Some(1), Some(0), Some(1))
    val root = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = LCP1022.sumRootToLeaf(root)
    output should be(22)
  }
}
