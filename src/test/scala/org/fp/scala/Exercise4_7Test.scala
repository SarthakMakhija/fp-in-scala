package org.fp.scala

import org.scalatest.FlatSpec

class Exercise4_7Test extends FlatSpec {

  it should "return Right of list of all elements given there is no Left" in {
    val expected = Right(List(10, 20 ,30))
    val elements = List(Right(10), Right(20), Right(30))
    val result   = Exercise4_7.sequence(elements)

    assert(result == expected)
  }

  it should "return Left of error given a Left" in {
    val expected = Left("a")
    val elements = List(Left("a"), Left("b"))
    val result   = Exercise4_7.sequence(elements)

    assert(result == expected)
  }

  it should "return Left of error given a Left along with Right" in {
    val expected = Left("b")
    val elements = List(Right(100), Right(10), Left("b"), Left("a"))
    val result   = Exercise4_7.sequence(elements)

    assert(result == expected)
  }
}
