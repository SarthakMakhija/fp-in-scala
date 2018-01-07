package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_2Test extends FlatSpec{

  it should "return a list containing 5 elements" in {
    val stream = Stream(1,2,3,4,5)
    val list   = stream.take(5)

    assert(list == List(1,2,3,4,5))
  }

  it should "return a list containing 3 elements" in {
    val stream = Stream(1,2,3,4,5)
    val list   = stream.take(3)

    assert(list == List(1,2,3))
  }

  it should "return an empty list given list is empty" in {
    val stream = Empty
    val list   = stream.take(5)

    assert(list == List())
  }

  it should "return an empty list given elements to take is 0" in {
    val stream = Stream(1,2,3,4,5)
    val list   = stream.take(0)

    assert(list == List())
  }
}
