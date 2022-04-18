package com.jonyroy.leetcode.arr

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP1480Test extends AnyFlatSpec with Matchers {
  it should "return running sum of 1d array" in {
    LCP1480.runningSum(Array(1, 2, 3, 4)) should be(Array(1, 3, 6, 10))
    LCP1480.runningSum(Array(1, 1, 1, 1, 1)) should be(Array(1, 2, 3, 4, 5))
    LCP1480.runningSum(Array(3, 1, 2, 10, 1)) should be(Array(3, 4, 6, 16, 17))
  }
}
