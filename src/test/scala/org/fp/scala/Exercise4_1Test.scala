package org.fp.scala

import org.scalatest.FlatSpec

class Exercise4_1Test extends FlatSpec {

  it should "return mapped value given Some" in {
    val value  = MySome(10)
    val result = value.map(_ * 100)

    assert(result.getOrElse(0) == 1000)
  }

  it should "return none given filter fails" in {
    val value  = MySome(10)
    val result = value.filter( _ > 1000)

    assert(result.getOrElse(0) == 0)
  }

  it should "return Some given flatMap" in {
    val value  = MySome(10)
    val result = value.flatMap( _ => MySome(1000))

    assert(result.getOrElse(0) == 1000)
  }

  it should "return none given map on None" in {
    val value  = MyNone
    val result = value.map( _ => 1000)

    assert(result eq MyNone)
  }
}
