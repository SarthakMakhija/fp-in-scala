package org.fp.scala

import org.scalatest.FlatSpec

class Exercise2_2Test extends FlatSpec{

  it should "return false as isSorted for an empty array" in {
    val isSorted = Exercise2_2.isSorted(Array(), null)
    assert(isSorted == false)
  }

  it should "return true as isSorted for an array with odd elements with binary function resulting in sorted as true" in {
    val isSorted = Exercise2_2.isSorted(Array(1,2,3,4,5), (_: Int) < (_: Int))
    assert(isSorted == false)
  }

  it should "return true as isSorted for an array with even elements with binary function resulting in sorted as true" in {
    val isSorted = Exercise2_2.isSorted(Array(1,2,3,4,5,6), (_: Int) < (_: Int))
    assert(isSorted == false)
  }

  it should "return false as isSorted for an array with 1 element" in {
    val isSorted = Exercise2_2.isSorted(Array(1), (_: Int) < (_: Int))
    assert(isSorted == false)
  }
}