package com.helloworld

import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import collection.mutable.Stack


class ScalaTestHelloWorld extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

}
