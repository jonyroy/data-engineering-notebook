package com.jonyroy.leetcode.strings

import com.typesafe.scalalogging.StrictLogging
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LCP2011Test extends AnyFlatSpec with Matchers with StrictLogging {

  it should "return Final Value of Variable After Performing Operations" in {
    LCP2011.finalValueAfterOperations(Array("--X", "X++", "X++")) should be(1)
    LCP2011.finalValueAfterOperations(Array("++X", "++X", "X++")) should be(3)
    LCP2011.finalValueAfterOperations(Array("X++", "++X", "--X", "X--")) should be(0)
  }

}
