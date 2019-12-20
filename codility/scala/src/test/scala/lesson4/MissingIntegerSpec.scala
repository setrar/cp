package lesson4

import org.scalatest._

class MissingIntegerSpec extends FlatSpec with Matchers {
  "The MissingInteger " should "not fail" in {
    MissingInteger.solution(Array(1, 3, 6, 4, 1, 2)) shouldEqual 5
    MissingInteger.solution(Array(1, 2, 3)) shouldEqual 4
    MissingInteger.solution(Array(-1, -3)) shouldEqual 1
  }
}
