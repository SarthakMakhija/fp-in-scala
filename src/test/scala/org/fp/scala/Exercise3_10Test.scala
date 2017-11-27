package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_10Test extends FlatSpec {

  it should "return initial value given an empty list" in {
    val result = Exercise3_10.foldLeft(List(), 0)( (_:Int) + (_:Int) )
    assert(result == 0)
  }

  it should "return aggregated value given initial value and a binary function" in {
    val result = Exercise3_10.foldLeft(List(1,2,3,4,5), 0)( (_:Int) + (_:Int) )
    assert(result == 15)
  }
}
