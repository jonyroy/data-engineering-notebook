package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP637Test extends AnyFlatSpec with Matchers with StrictLogging {
  it should "return average of Levels in Binary Tree" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val root2 = lcBinaryTree(Array(2147483647, 2147483647, 2147483647))
    val output = LCP637.averageOfLevels(root)
    val output2 = LCP637.averageOfLevels(root2)
    println(output2.toList)
    output should be(Array[Double](3.00000, 14.50000, 11.00000))
  }
}
