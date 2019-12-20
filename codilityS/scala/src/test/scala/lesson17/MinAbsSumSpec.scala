package lesson17

import org.scalatest._

class MinAbsSumSpec extends FlatSpec with Matchers {
  "The MinAbsSumSpec" should "not fail" in {
    MinAbsSum.solution(Array(1,5,2,-2)) shouldEqual 0
  }
}
