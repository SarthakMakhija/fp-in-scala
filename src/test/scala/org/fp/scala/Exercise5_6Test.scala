package org.fp.scala

import org.scalatest.FlatSpec

class Exercise5_6Test extends FlatSpec {

  it should "return None given stream is empty" in {
    val stream = Stream()
    val result = stream.foldRight[Option[Int]](None){
      (a, b) => if (a == None) None else Some(a)
    }

    assert(result.isEmpty)
  }

  it should "return the head as option given stream is not empty" in {
    val stream   = Stream(10,20,30,40,50)
    val expected = Some(10)
    val result = stream.foldRight[Option[Int]](None){
      (a, b) => if (a == None) None else Some(a)
    }

    assert(result == expected)
  }
}
