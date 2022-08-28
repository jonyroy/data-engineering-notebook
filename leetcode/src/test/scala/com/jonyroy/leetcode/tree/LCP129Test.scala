package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP129Test extends AnyFlatSpec with Matchers with StrictLogging {
  it should "return Sum Root to Leaf Numbers" in {
    val root = lcBinaryTree(Array(4, 9, 0, 5, 1))
    val root1 = lcBinaryTree(Array(1, 2, 3))
    val output = LCP129.sumNumbers(root)
    val output1 = LCP129.sumNumbers(root1)
    output should be(1026)
    output1 should be(25)
  }

}
