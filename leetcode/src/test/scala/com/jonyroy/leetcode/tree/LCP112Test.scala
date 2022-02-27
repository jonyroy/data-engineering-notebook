package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP112Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return true if any path sum equals to target value otherwise return false" in {
    val root = lcBinaryTree(Array(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1))
    val output = LCP112.hasPathSum(root, targetSum = 22)

    val root1 = lcBinaryTree(Array(1, 2, 3))
    val output1 = LCP112.hasPathSum(root1, targetSum = 5)
    output should be(true)
    output1 should be(false)
  }

}
