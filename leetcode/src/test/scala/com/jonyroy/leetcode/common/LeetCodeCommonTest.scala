package com.jonyroy.leetcode.common

import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LeetCodeCommonTest extends AnyFlatSpec with Matchers with StrictLogging {

  it should "be able to prepare test data input" in {
    val output = LeetCodeCommon.convertLeetCodeArray(Array[Any](2, null, 3, null, 4, null, 5, null, 6))
    val output1 = LeetCodeCommon.convertLeetCodeArray(Array[Any](null, null, null, null))
    val output2 = LeetCodeCommon.convertLeetCodeArray(Array[Any](1, 2, 3, 4))
    output should be(Array[Option[Int]](Some(2), None, Some(3), None, Some(4), None, Some(5), None, Some(6)))
    output1 should be(Array[Option[Int]](None, None, None, None))
    output2 should be(Array[Option[Int]](Some(1), Some(2), Some(3), Some(4)))
  }

  it should "be able to construct binary tree" in {
    val input = Array[Any](2, 3, null, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9)
    val output = LeetCodeCommon.lcBinaryTree(input)
    println(output)
  }

}
