package lesson10

import org.scalatest._

class CountFactorsSpec extends FlatSpec with Matchers {
  "The CountFactorsSpec " should "not fail" in {
    CountFactors.slowsolution1(24) shouldEqual 8
  }
}
