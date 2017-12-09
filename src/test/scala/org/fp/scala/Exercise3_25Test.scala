package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_25Test extends FlatSpec{

  it should "return size as 1 given a leaf node" in {
    val leaf = Leaf(10)
    val size = Exercise3_25.size(leaf)

    assert(size == 1)
  }

  it should "return size as 3 given a branch with left and right leaf node" in {
    val branch = Branch(Leaf(10), Leaf(20))
    val size   = Exercise3_25.size(branch)

    assert(size == 3)
  }

  it should "return size as 7 given a branch with left and right leaf node" in {
    val branch = Branch(Branch(Leaf("a"), Leaf("b")), Branch(Leaf("c"), Leaf("d")))
    val size   = Exercise3_25.size(branch)

    assert(size == 7)
  }
}
