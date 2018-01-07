package org.fp.scala


object Exercise4_7 {

  def sequence[E, A](es: List[Either[E, A]]): Either[E, List[A]] = {

    def sequence$[E,A](elements: List[Either[E, A]], lefts: List[E] = List(), rights: List[A] = List()): (List[E], List[A]) = {
      elements match {
        case Nil => (lefts.reverse, rights.reverse)
        case head :: tail =>
          if (head.isInstanceOf[Left[E]]) sequence$(tail, head.asInstanceOf[Left[E]].value :: lefts, rights)
          else                                  sequence$(tail, lefts, head.asInstanceOf[Right[A]].value :: rights)
      }
    }
    val (lefts, rights) = sequence$(es, List(), List())
    if ( lefts.isEmpty ) Right(rights)
    else                 Left(lefts.head)
  }
}