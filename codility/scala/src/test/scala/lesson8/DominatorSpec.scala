package lesson8

import org.scalatest._

class DominatorSpec extends FlatSpec with Matchers {
  "The DominatorSpec " should "not fail" in {
    Dominator.solution(Array(3, 2, 3, 4, 3, 3, 3, -1)) shouldEqual 0
  }
}
