package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP226Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Invert Binary Tree" in {
    val root = lcBinaryTree(Array(4, 2, 7, 1, 3, 6, 9))
    val expected = lcBinaryTree(Array(4, 7, 2, 9, 6, 3, 1))
    val output = LCP226.invertTree(root)
    output should be(expected)
  }

}
