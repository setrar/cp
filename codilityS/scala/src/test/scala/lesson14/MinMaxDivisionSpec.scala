package lesson14

import org.scalatest._

class MinMaxDivisionSpec extends FlatSpec with Matchers {
  "The MinMaxDivisionSpec" should "not fail" in {
    MinMaxDivision.solution(3,5,Array(2,1,5,1,2,2,2)) shouldEqual 6
  }
}
