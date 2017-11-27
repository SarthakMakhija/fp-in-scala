package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_9Test extends FlatSpec {

  it should "return 0 as the length of an empty list" in {
    val length = Exercise3_9.length(List())
    assert(length == 0)
  }

  it should "return 5 as the length of the list with 5 elements" in {
    val length = Exercise3_9.length(List(1,2,3,4,5))
    assert(length == 5)
  }
}