package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP938Test extends AnyFlatSpec with Matchers {

  it should "return sum of BST range" in {
    val binaryTree = lcBinaryTree(Array(10, 5, 15, 3, 7, 13, 18, 1, null, 6))
    LCP938.rangeSumBST(binaryTree, 6, 10) should be(23)
  }
}
