package org.fp.scala

import org.scalatest.FlatSpec

class Exercise4_2Test extends FlatSpec {

  it should "return none given an empty sequence" in {
    val xs = Nil
    val variance = Exercise4_2.variance(xs)

    assert(variance eq None)
  }

  it should "return variance given non empty sequence" in {
    val xs        = Seq(1.0,2.0,4.0,3.0)
    val variance  = Exercise4_2.variance(xs)

    assert(variance.getOrElse(0.0) == 1.25)
  }
}
