package org.fp.scala

import scala.annotation.tailrec

object Exercise3_12 {

  def reverse(as: List[Int]): List[Int] = {
    as match {
      case Nil => as
      case head :: tail => reverse(tail) ::: List(head)
    }
  }

  @tailrec
  def reverseTailRecursive(as: List[Int], agg: List[Int] = List()): List[Int] = {
    as match {
      case Nil => agg
      case head :: tail => reverseTailRecursive(tail, List(head) ::: agg)
    }
  }
}