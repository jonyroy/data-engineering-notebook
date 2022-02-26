package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP701Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Insert into a Binary Search Tree" in {
    val root = lcBinaryTree(Array(4, 2, 7, 1, 3))
    val output = LCP701.insertIntoBST(root, 5)
    val expectedOutput: Array[Option[Int]] =
      Array(Some(4), Some(2), Some(7), Some(1), Some(3), Some(5), None, None, None, None, None, None, None)

    val expected = convertTreeToArray(output)
    expected should be(expectedOutput)
  }
}
