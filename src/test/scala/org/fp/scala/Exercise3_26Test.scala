package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_26Test extends FlatSpec {

  it should "return the maximum value given leaf node" in {
    val leaf = Leaf(10)
    val max  = Exercise3_26.maximum(leaf)

    assert(max == 10)
  }

  it should "return maximum value 20 given a branch with left and right leaf node" in {
    val branch = Branch(Leaf(10), Leaf(20))
    val max    = Exercise3_26.maximum(branch)

    assert(max == 20)
  }

  it should "return maximum value 100 given a branch with left and right leaf node" in {
    val branch = Branch(Branch(Leaf(100), Leaf(20)), Branch(Leaf(30), Leaf(40)))
    val max = Exercise3_26.maximum(branch)

    assert(max == 100)
  }
}
