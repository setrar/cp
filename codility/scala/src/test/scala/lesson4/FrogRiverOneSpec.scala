package lesson4

import org.scalatest._

class FrogRiverOneSpec extends FlatSpec with Matchers {
  "The FrogRiverOneSpec " should "not fail" in {
    val ar1 = Array(1, 3, 1, 4, 2, 3, 5, 4)
    val ar2 = Array(4,3,2,1,5,4,3,2,1,6)
    FrogRiverOne.solution(5, ar1) shouldEqual 6
    FrogRiverOne.solution(6, ar2) shouldEqual 9
  }
}
