package com.jonyroy.leetcode.arr

object LCP1480 {
  def runningSum(nums: Array[Int]): Array[Int] = {
    for (i <- 1 until nums.length) {
      nums(i) += nums(i - 1)
    }
    nums
  }
}
