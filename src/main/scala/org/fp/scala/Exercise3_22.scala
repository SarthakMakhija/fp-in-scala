package org.fp.scala

object Exercise3_22 {

  def zipWith[A, B](as: List[A], bs: List[B]): List[(A, B)] = {
    def zipWith$[A, B](as: List[A], bs: List[B], collector: List[(A, B)]): List[(A, B)] = {
      (as, bs) match {
        case (x, y) if x.nonEmpty && y.nonEmpty => zipWith$(x.tail, y.tail, collector ::: List((x.head, y.head)))
        case _ => collector
      }
    }
    zipWith$(as, bs, List())
  }
}