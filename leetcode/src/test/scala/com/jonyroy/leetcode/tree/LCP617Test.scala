package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP617Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "Merge Two Binary Trees" in {
    val root1 = lcBinaryTree(Array(1, 3, 2, 5))
    val root2 = lcBinaryTree(Array(2, 1, 3, null, 4, null, 7))
    val output = convertTreeToArray(LCP617.mergeTrees(root1, root2))

    val root3 = lcBinaryTree(Array(1))
    val root4 = lcBinaryTree(Array(2, 1, 3, null, 4, null, 7))
    val output2 = convertTreeToArray(LCP617.mergeTrees(root3, root4))

    output should be(
      Array(Some(3), Some(4), Some(5), Some(5), Some(4), None, Some(7), None, None, None, None, None, None))

    output2 should be(Array(Some(3), Some(1), Some(3), None, Some(4), None, Some(7), None, None, None, None))
  }

}
