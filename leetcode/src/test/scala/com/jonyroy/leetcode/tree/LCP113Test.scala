package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.LeetCodeCommon._
import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP113Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return  Path Sum of targeted value" in {
    val root = lcBinaryTree(Array(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1))
    val output = LCP113.pathSum(root, targetSum = 22)
    output should contain allElementsOf (List(List(5, 4, 11, 2), List(5, 8, 4, 5)))
  }

}
