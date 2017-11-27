package org.fp.scala

object Exercise3_20 {

  def flatMap[A,B](as: List[A])(f: A => List[B]): List[B] = as.foldLeft(List[B]()) { (agg: List[B], element: A) => agg ::: f(element)  }
}