package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP1609Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "be able to return whether the binary tree is odd or even" in {
    val root = lcBinaryTree(Array(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2))
    val root1 = lcBinaryTree(Array(5, 4, 2, 3, 3, 7))
    val root2 = lcBinaryTree(Array(5, 9, 1, 3, 5, 7))
    val output = LCP1609.isEvenOddTree(root)
    val output1 = LCP1609.isEvenOddTree(root1)
    val output2 = LCP1609.isEvenOddTree(root2)

    output should be(true)
    output1 should be(false)
    output2 should be(false)
  }
}
