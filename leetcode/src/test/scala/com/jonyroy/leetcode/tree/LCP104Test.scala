package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP104Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return maximum Depth of Binary Tree" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val output = LCP104.maxDepth(root)

    LCP104.maxDepth(null) should be(0)
    output should be(3)
  }

}
