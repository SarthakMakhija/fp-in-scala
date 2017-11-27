package org.fp.scala

object Exercise3_4 {

  def drop[A](l: List[A], n: Int): List[A] = {
    l match {
      case head :: tail if (n != 0)  => drop(l = tail, n = n-1)
      case Nil                       => l
      case _ if (n == 0)             => l
    }
  }
}