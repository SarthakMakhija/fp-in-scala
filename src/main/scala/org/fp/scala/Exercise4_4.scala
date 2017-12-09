package org.fp.scala

object Exercise4_4 {

  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    def sequence$[A1](as: List[Option[A1]]) : List[A1] = as match {
        case Nil => Nil
        case head :: tail => if (head == None) throw new IllegalArgumentException else List(head.get) ::: sequence$(tail)
    }
    try{
      Some(sequence$(a))
    }catch {
      case ex: IllegalArgumentException => None
    }
  }
}