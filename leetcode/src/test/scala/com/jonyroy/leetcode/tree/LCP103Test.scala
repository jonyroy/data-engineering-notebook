package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP103Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return Zigzag binary tree level order nodes" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val root1 = lcBinaryTree(Array(1))
    val root2 = lcBinaryTree(Array(null))
    val output = LCP103.zigzagLevelOrder(root)
    val output1 = LCP103.zigzagLevelOrder(root1)
    val output2 = LCP103.zigzagLevelOrder(root2)
    output should be(List(List(3), List(20, 9), List(15, 7)))
    output1 should be(List(List(1)))
    output2 should be(List.empty)
  }

}
