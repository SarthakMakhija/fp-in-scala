package org.fp.scala

object Exercise3_15 {

  def concatenate[A](as : List[List[A]]) = as.foldLeft(List[A]()){ (agg: List[A], element: List[A]) => agg ::: element }
}