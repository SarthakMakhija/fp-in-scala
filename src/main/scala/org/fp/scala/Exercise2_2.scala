package org.fp.scala

object Exercise2_2 {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = if (as.isEmpty || as.length == 1) false else {
    val elements = as.take(2)
    if ( ordered(elements(0), elements(1)) == false ) false else isSorted(as.drop(1), ordered)
  }
}