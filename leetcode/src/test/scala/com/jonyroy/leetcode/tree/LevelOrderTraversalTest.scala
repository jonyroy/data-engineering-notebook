package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LevelOrderTraversalTest extends AnyFlatSpec with Matchers with StrictLogging {
  it should "return level order nodes" in {
    val root = LeetCodeCommon.lcBinaryTree(Array(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2))
    val output = LevelOrderTraversal.getNodesByLevel(root)
    println(output)
  }
}
