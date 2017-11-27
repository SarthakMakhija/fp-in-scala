package org.fp.scala

object Exercise3_9 {

  def length[A](as: List[A]): Int = as.foldRight(0)((element: A, acc: Int) => acc + 1)
}