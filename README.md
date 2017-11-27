# Functional Programming in Scala
This repository contains the solutions to the problems mentioned in *Manning Functional Pogramming in Scala.*

The project includes - 
1. Scala
2. Scala test
3. Maven 

Every exercise has its own scala file. Exercise 3.9 is written in a scala file - Exercise3_9 and the unit test for the same is 
written is Exercise3_9Test

Eg;

```
package org.fp.scala

object Exercise3_9 {

  def length[A](as: List[A]): Int = as.foldRight(0)((element: A, acc: Int) => acc + 1)
}
```

and the test for same - 

```
package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_9Test extends FlatSpec {

  it should "return 0 as the length of an empty list" in {
    val length = Exercise3_9.length(List())
    assert(length == 0)
  }

  it should "return 5 as the length of the list with 5 elements" in {
    val length = Exercise3_9.length(List(1,2,3,4,5))
    assert(length == 5)
  }
}
```
