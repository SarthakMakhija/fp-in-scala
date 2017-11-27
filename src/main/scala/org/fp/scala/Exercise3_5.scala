package org.fp.scala

object Exercise3_5 {

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Nil          => l
      case head :: tail if f(head)  => dropWhile(tail, f)
      case head :: tail if !f(head) => head :: tail
    }
  }
}