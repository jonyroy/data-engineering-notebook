package com.jonyroy.leetcode.strings

object LCP2011 {
  def finalValueAfterOperations(operations: Array[String]): Int = {
    var finalResult: Int = 0
    for (i <- operations) {
      if (i == "X++") finalResult += 1
      if (i == "++X") finalResult += 1
      if (i == "X--") finalResult -= 1
      if (i == "--X") finalResult -= 1
    }
    finalResult
  }
}
