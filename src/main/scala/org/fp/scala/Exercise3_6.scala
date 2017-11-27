package org.fp.scala

object Exercise3_6 {

  def init[A](l: List[A]): List[A] = {
    def init$(input: List[A], aggregate: List[A]): List[A] = {
      input match {
        case Nil          => input
        case head :: tail if (tail.length == 1 || tail.isEmpty) => aggregate ::: List(head)
        case head :: tail if (tail.length > 1)  => init$(tail, aggregate ::: List(head))
      }
    }
    init$(l, List())
  }
}