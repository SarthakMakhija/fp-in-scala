package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_12Test extends FlatSpec {

  it should "return empty list given an empty list" in {
    val items = Exercise3_12.reverse(List())
    assert(items.length == 0)
  }

  it should "return reversed list" in {
    val items = Exercise3_12.reverse(List(1,2,3,4))
    assert(items == List(4,3,2,1))
  }

  it should "return reversed list containing single element" in {
    val items = Exercise3_12.reverse(List(1))
    assert(items == List(1))
  }

  it should "return reversed list with tailrec" in {
    val items = Exercise3_12.reverseTailRecursive(List(1,2,3,4))
    assert(items == List(4,3,2,1))
  }

  it should "return reversed list with tailrec containing single element" in {
    val items = Exercise3_12.reverseTailRecursive(List(1))
    assert(items == List(1))
  }
}
