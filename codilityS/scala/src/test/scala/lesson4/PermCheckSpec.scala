package lesson4

import org.scalatest._

class PermCheckSpec extends FlatSpec with Matchers {
  "The PermCheckSpec " should "not fail" in {
    PermCheck.solution(Array(4, 1, 3, 2)) shouldEqual 1
    PermCheck.solution(Array(4, 1, 3)) shouldEqual 0
    PermCheck.solution(Array(5,3,2,1,4)) shouldEqual 1
  }
}
