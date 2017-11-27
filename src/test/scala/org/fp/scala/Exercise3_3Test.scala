package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_3Test extends FlatSpec {

  it should "return an empty list" in {
    val items = Exercise3_3.setHead(List(), null)
    assert(items.size == 0)
  }

  it should "return a list with head replaced with a different value" in {
    val items = Exercise3_3.setHead(List(1,2,3,4,5), 40)
    assert(items == List(40, 2, 3, 4, 5))
  }
}
