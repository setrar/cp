package lesson5

import org.scalatest._

class CountDivSpec extends FlatSpec with Matchers {
  "The CountDivSpec" should "not fail" in {
    CountDiv.solution(6,11,2) shouldEqual 3

  }
}
