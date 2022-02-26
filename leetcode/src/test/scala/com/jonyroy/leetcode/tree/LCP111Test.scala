package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP111Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return minimum Depth of Binary Tree" in {
    val root = lcBinaryTree(Array(3, 9, 20, null, null, 15, 7))
    val output = LCP111.minDepth(root)

    val rootTwo = lcBinaryTree(Array(2, null, 3, null, 4, null, 5, null, 6))
    val output2 = LCP111.minDepth(rootTwo)

    LCP111.minDepth(null) should be(0)
    output should be(2)
    output2 should be(5)
  }

}
