package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP102Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return binary tree level order nodes" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val root1 = lcBinaryTree(Array(1))
    val root2 = lcBinaryTree(Array(null))
    val output = LCP102.levelOrder(root)
    val output1 = LCP102.levelOrder(root1)
    val output2 = LCP102.levelOrder(root2)
    output should be(List(List(3), List(9, 20), List(15, 7)))
    output1 should be(List(List(1)))
    output2 should be(List.empty)
  }

}
