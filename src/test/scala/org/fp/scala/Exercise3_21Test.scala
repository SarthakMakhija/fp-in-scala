package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_21Test extends FlatSpec {

  it should "return filtered elements" in {
    val items = Exercise3_21.flatMapAsFilter(List(1,2,3,4)) { (e: Int) => if (e%2 == 0) List(true, false) else List(true, true) }
    assert(items == List(1,3))
  }

  it should "return empty list" in {
    val items = Exercise3_21.flatMapAsFilter(List(1,2,3,4)) { _ => List(false) }
    assert(items == List())
  }
}
