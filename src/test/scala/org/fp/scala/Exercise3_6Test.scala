package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_6Test extends FlatSpec {

  it should "return empty list given an empty list" in {
    val items = Exercise3_6.init(List())
    assert(items.length == 0)
  }

  it should "return return a list except the last element given list with size greater than 1" in {
    val items = Exercise3_6.init(List(1,2,3,4,5,6))
    assert(items == List(1,2,3,4,5))
  }

  it should "return return a list except the last element given list with size equal to 1" in {
    val items = Exercise3_6.init(List(1))
    assert(items == List(1))
  }
}