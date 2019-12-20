package lesson6

import org.scalatest.{FlatSpec, Matchers}

class DistinctSpec extends FlatSpec with Matchers {
  "The DistinctSpec " should "not fail" in {
    Distinct.solution(Array(2, 1, 1, 2, 3, 1)) shouldEqual 3
  }
}

