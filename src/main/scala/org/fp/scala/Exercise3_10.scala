package org.fp.scala

import scala.annotation.tailrec

object Exercise3_10 {

  @tailrec
  def foldLeft[A,Int](as: List[A], z: Int)(f: (Int, A) => Int): Int = {
    as match {
      case Nil => z
      case head :: tail => foldLeft(tail, f(z, head))(f)
    }
  }
}