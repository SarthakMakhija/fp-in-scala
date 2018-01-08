package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_7Test extends FlatSpec {

  it should "return mapped elements in a list" in {
    val stream = Stream(1,2,3,4,5)
    val result = stream.map( _ * 2)

    assert(result == List(2,4,6,8,10))
  }
}
