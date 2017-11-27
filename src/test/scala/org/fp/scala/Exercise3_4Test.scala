package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_4Test extends FlatSpec {

  it should "return empty given an empty list" in {
    val items = Exercise3_4.drop(List(), 0)
    assert(items.length == 0)
  }

  it should "return a list with N elements dropped given N = 1" in {
    val items = Exercise3_4.drop(List(10, 20, 30, 40, 50), 1)
    assert(items == List(20, 30, 40, 50))
  }

  it should "return a list with N elements dropped given N = 3" in {
    val items = Exercise3_4.drop(List(10, 20, 30, 40, 50), 3)
    assert(items == List(40, 50))
  }
}
