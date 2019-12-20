package lesson4

import org.scalatest._

class MaxCountersSpec extends FlatSpec with Matchers {
  "The MaxCountersSpec " should "not fail" in {
    val ops = Array(3, 4, 4, 6, 1, 4, 4)
    MaxCounters.solution(5, ops) shouldEqual Array(3, 2, 2, 4, 2)
  }
}
