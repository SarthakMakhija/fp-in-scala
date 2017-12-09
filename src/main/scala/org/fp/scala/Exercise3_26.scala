package org.fp.scala

object Exercise3_26 {

  def maximum(tree: Tree[Int]): Int = {
    def maximum$(max: Int): Int = tree match {
        case Leaf(x)             => if (x > max) x else max
        case Branch(left, right) => maximum(left) max maximum(right)
    }
    maximum$(-Int.MaxValue)
  }
}