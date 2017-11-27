package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_18Test extends FlatSpec {

  it should "return a list of integers mapped as mentioned by map function" in {
    val items = Exercise3_18.map(List(1,2,3,4)){ _ + 1}
    assert(items == List(2,3,4,5))
  }

  it should "return a list of string mapped as mentioned by map function" in {
    val items = Exercise3_18.map(List("a", "b", "c")){ _.toUpperCase}
    assert(items == List("A", "B", "C"))
  }
}