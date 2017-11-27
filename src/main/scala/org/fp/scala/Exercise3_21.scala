package org.fp.scala

object Exercise3_21 {

  def flatMapAsFilter[A](as: List[A])(f: A => List[Boolean]): List[A] =
          as.foldLeft(List[A]()){ (agg: List[A], element: A) => if ( f(element).forall( _ == true) ) agg ::: List(element) else agg }
}
