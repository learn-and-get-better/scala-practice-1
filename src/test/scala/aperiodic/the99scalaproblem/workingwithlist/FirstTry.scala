package aperiodic.the99scalaproblem.workingwithlist

import org.scalatest.FreeSpec

class FirstTry extends FreeSpec {


  "question no 1" - {
    "using built in method" - {
      def last1(ints: List[Int]) = ints.last

      val result = last1(List(1, 1, 2, 3, 5, 8))
      assert(result === 8)

    }
    "using pattern matching" - {
      def last(ints: List[Int]): Int = ints match {
        case tail :: Nil => tail
        case _ :: tail => last(tail)

      }

      val result = last(List(1, 1, 2, 3, 5, 8))
      assert(result === 8)

    }
    "using generics" - {

      def last[A](list: List[A]): A = list.last

      val result = last(List(1, 1, 2, 3, 5, 8))
      assert(result === 8)

      assert(last(List("hello", "hi", "goodbye")) === "goodbye")

    }
  }


}
