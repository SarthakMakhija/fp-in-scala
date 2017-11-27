package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_15Test extends FlatSpec {

  it should "return an empty list" in {
    val items = Exercise3_15.concatenate(List(List()))
    assert(items.length == 0)
  }

  it should "return a flattened list" in {
    val items = Exercise3_15.concatenate(List(List(1,2,3), List(4,5,6), List(7,8,9)))
    assert(items == List(1,2,3,4,5,6,7,8,9))
  }
}