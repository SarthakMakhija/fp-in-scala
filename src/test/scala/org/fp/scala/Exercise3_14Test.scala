package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_14Test extends FlatSpec{

  it should "return a combined list given two lists of type A" in {
    val items = Exercise3_14.append(List(1,2,3,4), List(5,6,7,8))
    assert(items == List(1,2,3,4,5,6,7,8))
  }

  it should "return a combined list given one of the lists is empty" in {
    val items = Exercise3_14.append(List(), List(5,6,7,8))
    assert(items == List(5,6,7,8))
  }

  it should "return a empty list given both the lists are empty" in {
    val items = Exercise3_14.append(List(), List())
    assert(items == List())
  }
}