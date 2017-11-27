package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_22Test extends FlatSpec {

  it should "return a list of tuple given two lists with same number of elements" in {
    val items = Exercise3_22.zipWith(List(1,2,3), List(4,5,6))
    assert(items == List((1,4), (2,5), (3,6)))
  }

  it should "return a list of tuple given two lists with different number of elements" in {
    val items = Exercise3_22.zipWith(List(1,2,3), List(4))
    assert(items == List((1,4)))
  }

  it should "return a list of tuple given one of the lists is empty" in {
    val items = Exercise3_22.zipWith(List(1,2,3), List())
    assert(items == List())
  }
}
