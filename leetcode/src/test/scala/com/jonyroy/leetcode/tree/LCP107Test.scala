package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP107Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return  Binary Tree Level Order Traversal II nodes" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val root1 = lcBinaryTree(Array(1))
    val root2 = lcBinaryTree(Array(null))
    val output = LCP107.levelOrderBottom(root)
    val output1 = LCP107.levelOrderBottom(root1)
    val output2 = LCP107.levelOrderBottom(root2)
    output should be(List(List(15, 7), List(9, 20), List(3)))
    output1 should be(List(List(1)))
    output2 should be(List.empty)
  }

}
