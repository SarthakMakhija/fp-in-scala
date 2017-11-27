package org.fp.scala

object Exercise3_3 {

  def setHead[A](items: List[A], newValue: A) = items match {
    case Nil => items
    case head :: tail => newValue :: tail
  }
}