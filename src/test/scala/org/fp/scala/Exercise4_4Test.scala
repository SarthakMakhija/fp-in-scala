package org.fp.scala

import org.scalatest.FlatSpec

class Exercise4_4Test extends FlatSpec {

  it should "return Some of empty list given an empty list" in {
    val list   = Nil
    val result = Exercise4_4.sequence(list)

    assert(result.get == list)
  }

  it should "return None given a list containing None" in {
    val list   = List(Some(10), Some(20), None)
    val result = Exercise4_4.sequence(list)

    assert(result == None)
  }

  it should "return Some given a list without None" in {
    val list   = List(Some(10), Some(20), Some(100))
    val result = Exercise4_4.sequence(list)

    assert(result.get == List(10, 20, 100))
  }
}
