package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_4Test extends FlatSpec{

  it should "return true given predicate is true for all the elements" in {
    val stream = Stream(1,2,3,4,5)
    val result = stream.forAll( _ > 0)

    assert(result)
  }

  it should "return false given predicate is not true for all the elements" in {
    val stream = Stream(2,1,3,4,5)
    val result = stream.forAll( _% 2 == 0)

    assert(!result)
  }

  it should "return FALSE given predicate is not true for all the elements" in {
    val stream = Stream(10, 20, 30, 40, 1)
    val result = stream.forAll( _% 2 == 0)

    assert(!result)
  }
}
