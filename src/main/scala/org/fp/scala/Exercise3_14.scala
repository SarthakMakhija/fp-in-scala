package org.fp.scala

object Exercise3_14 {

  def append[A](as : List[A], bs: List[A]) = bs.foldLeft(as) { (agg: List[A], element: A) => agg ::: List(element) }
}