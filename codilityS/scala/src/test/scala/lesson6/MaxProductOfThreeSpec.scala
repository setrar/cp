package lesson6

import org.scalatest.{FlatSpec, Matchers}

class MaxProductOfThreeSpec extends FlatSpec with Matchers {
  "The MaxProductOfThreeSpec " should "not fail" in {
    val ar1 = Array(-3, 1, 2, -2, 5, 6)
    MaxProductOfThree.solution(ar1) shouldEqual 60
    val ar2 = Array(0, 0, 0)
    MaxProductOfThree.solution(ar2) shouldEqual 0
    val ar3 = Array(3, 5, 7, 9, 10, -12, -25)
    MaxProductOfThree.solution(ar3) shouldEqual 3000
    val ar4 = Array(-3, -20, -1, -6, -90, -12, -12)
    MaxProductOfThree.solution(ar4) shouldEqual -18
  }
}

