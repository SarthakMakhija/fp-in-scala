package org.fp.scala

object Exercise3_18 {

  def map[A,B](as: List[A])(f: A => B): List[B] = as.map(f)
}