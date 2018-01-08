package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_5Test extends FlatSpec{

  it should "return all the elements which pass the predicate in the list" in {
    val stream = Stream(1,2,3,4,5)
    val result = stream.takeWhile( _ % 2 == 0)

    assert(result == List(2, 4))
  }

  it should "return empty list given no elements pass the predicate" in {
    val stream = Stream(1,2,3,4,5)
    val result = stream.takeWhile( _ > 10 )

    assert(result == List())
  }
}
