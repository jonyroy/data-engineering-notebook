package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP938Test extends AnyFlatSpec with Matchers {

  it should "return sum of BST range" in {
    val inputArray = Array(Some(10), Some(5), Some(15), Some(3), Some(7), Some(13), Some(18), Some(1), None, Some(6))
    val binaryTree = LeetCodeCommon.constructBinaryTree(inputArray, 0, inputArray.length)
    LCP938.rangeSumBST(binaryTree, 6, 10) should be(23)
  }
}
