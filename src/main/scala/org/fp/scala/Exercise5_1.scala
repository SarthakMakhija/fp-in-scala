package org.fp.scala

sealed trait Stream[+A] {
  def headOption: Option[A] = this match {
    case Empty => None
    case Cons(h, t) => Some(h())
  }

  def toList: List[A] = {
    def toList$(stream: Stream[A] ,collector: List[A]): List[A] = {
      stream match {
        case Empty      => collector.reverse
        case Cons(h, t) => toList$(t(), h() :: collector)
      }
    }
    toList$(this, List())
  }

  def take(n: Int) = {
    def take$(stream: Stream[A], elementsTaken: Int, collector: List[A]): List[A] = {
      stream match {
        case Empty                            => collector.reverse
        case Cons(h, t) if elementsTaken <= n => take$(t(), elementsTaken + 1, h() :: collector)
        case _                                => collector.reverse
      }
    }
    take$(this, 1, List())
  }

  def forAll(p: A => Boolean): Boolean = {
    def forAll$(stream: Stream[A], result: Boolean = false): Boolean = {
      stream match {
        case Empty      => result
        case Cons(h ,t) => if (p(h())) forAll$(t(), result = true) else false
      }
    }
    forAll$(this)
  }

  def foldRight[B](z: => B)(f: (A, => B) => B): B = {
    this match {
      case Cons(h,t) => f(h(), t().foldRight(z)(f))
      case _ => z
    }
  }

  def takeWhile(p: A => Boolean): List[A] = {
    foldRight(List[A]()){
      (a, b) => if (p(a)) List(a) ::: b else b
    }
  }

  def map[B](p: A => B) : List[B] = {
    foldRight(List[B]()) {
      (a, b) => p(a) :: b
    }
  }
}
case object Empty extends Stream[Nothing]
case class Cons[+A](h: () => A, t: () => Stream[A]) extends Stream[A]

object Stream {
  def cons[A](hd: => A, tl: => Stream[A]): Stream[A] = {
    lazy val head = hd
    lazy val tail = tl
    Cons(() => head, () => tail)
  }
  def empty[A]: Stream[A] = Empty
  def apply[A](as: A*): Stream[A] =
    if (as.isEmpty) empty else cons(as.head, apply(as.tail: _*))
}