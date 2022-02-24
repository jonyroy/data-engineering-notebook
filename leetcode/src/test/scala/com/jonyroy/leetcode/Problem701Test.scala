package com.jonyroy.leetcode

import com.jonyroy.leetcode.common.LeetCodeCommon
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Problem701Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Insert into a Binary Search Tree" in {
    val input = Array[Option[Int]](Some(4), Some(2), Some(7), Some(1), Some(3))
    val root = LeetCodeCommon.constructBinaryTree(input, 0, input.length)
    val output = Problem701.insertIntoBST(root, 5)
    val expectedOutput = Array[Option[Int]](Some(4), Some(2), Some(7), Some(1), Some(3), Some(5),None, None, None, None, None, None, None)
    val expected = LeetCodeCommon.convertTreeToArray(output)
    expected should be(expectedOutput)
  }
}
