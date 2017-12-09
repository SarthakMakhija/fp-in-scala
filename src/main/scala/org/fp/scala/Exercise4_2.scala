package org.fp.scala

object Exercise4_2 {

  def variance(xs: Seq[Double]): Option[Double] = xs match {
    case Nil => None
    case _   =>
      val size = xs.size
      val mean = (xs.sum / size)
      Some(xs.map( _ - mean).map(math.pow(_ , 2)).sum / size)
  }
}