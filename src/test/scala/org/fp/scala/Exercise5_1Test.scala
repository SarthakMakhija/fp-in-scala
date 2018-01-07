package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_1Test extends FlatSpec{

  it should "return the list representation of Stream" in {
    val stream = Stream(1,2,3,4,5)
    val list   = stream.toList

    assert(list == List(1,2,3,4,5))
  }

  it should "return the list representation of empty Stream" in {
    val stream = Empty
    val list   = stream.toList

    assert(list == List())
  }
}
