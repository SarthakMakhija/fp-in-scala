package org.fp.scala

import org.scalatest.FlatSpec

class Exercise4_6Test extends FlatSpec {

  it should "return Left given a Left type" in {
    val either = Left(new RuntimeException("test"))
    val mapped = either.map( _ => 2)

    assert(mapped eq either)
  }

  it should "return Right given a Right type" in {
    val either   = Right(10)
    val expected = Right(20)
    val mapped   = either.map(v => v * 2)

    assert(mapped == expected)
  }

  it should "return Right given a Right type invoking orElse" in {
    val either   = Right(10)
    val expected = Right(10)
    val mapped   = either.orElse(Right(100))

    assert(mapped == expected)
  }

  it should "return Right given a Right type invoking map2" in {
    val either   = Right(10)
    val expected = Right(5000)
    val mapped   = either.map2[IllegalArgumentException, Int, Int](Right(100)){
      (a, b) => 5000
    }

    assert(mapped == expected)
  }

  it should "return Left given a Left type invoking map2" in {
    val either   = Right(10)
    val expected = Left(new RuntimeException("test"))
    val mapped   = either.map2[RuntimeException, Int, Int](Left(new RuntimeException("test"))){
      (a, b) => 5000
    }

    assert(mapped.isInstanceOf[Left[Nothing]])
  }
}
