package org.fp.scala

import org.scalatest.FlatSpec

class Exercise3_20Test extends FlatSpec {

  it should "return empty list given empty list" in {
    val items = Exercise3_20.flatMap(List()){ _ => List() }
    assert(items.length == 0)
  }

  it should "return flattened list given each elements maps to a list" in {
    val items = Exercise3_20.flatMap(List("word", "hello")) { word => word.toCharArray.toList }
    assert(items == List('w', 'o', 'r', 'd', 'h', 'e', 'l', 'l', 'o'))
  }
}
