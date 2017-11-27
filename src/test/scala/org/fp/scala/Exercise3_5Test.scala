package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_5Test extends FlatSpec {

  it should "return empty list given an empty list" in {
    val items = Exercise3_5.dropWhile(List(), null)
    assert(items.length == 0)
  }

  it should "return a list with items dropped until matching a predicate" in {
    val items = Exercise3_5.dropWhile(List(10, 20, 12, 30, 5), (_: Int) % 10 == 0)
    assert(items == List(12, 30, 5))
  }

  it should "return a list with all but one items dropped until matching a predicate" in {
    val items = Exercise3_5.dropWhile(List(10, 20, 30, 5), (_: Int) % 10 == 0)
    assert(items == List(5))
  }
}