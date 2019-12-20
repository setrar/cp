package lesson6

import org.scalatest.{FlatSpec, Matchers}

class TriangleSpec extends FlatSpec with Matchers {
  "The TriangleSpec " should "not fail" in {
    val ar1 = Array(10, 2, 5, 1, 8, 20)
    Triangle.solution(ar1) shouldEqual 1
    val ar2 = Array(10, 50, 5, 1)
    Triangle.solution(ar2) shouldEqual 0
    val ar3 = Array[Int]()
    Triangle.solution(ar3) shouldEqual 0
    val ar4 = Array(1, 1, 1)
    Triangle.solution(ar4) shouldEqual 1
    val ar5 = Array(2, 3)
    Triangle.solution(ar5) shouldEqual 0
  }
}

