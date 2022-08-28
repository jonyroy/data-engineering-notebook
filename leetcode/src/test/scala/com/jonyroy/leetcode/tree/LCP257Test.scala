package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP257Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return Binary Tree Paths" in {
    val root = lcBinaryTree(Array(1, 2, 3, null, 5))
    val output: List[String] = LCP257.binaryTreePaths(root)
    output should contain allElementsOf List("1->2->5", "1->3")
  }

}
