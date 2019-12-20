package lesson7

import org.scalatest._

class BracketsSpec extends FlatSpec with Matchers {
  "The BracketsSpec " should "not fail" in {
    Brackets.solution("{[()()]}") shouldEqual 1
    Brackets.solution("([)()]") shouldEqual 0
    Brackets.solution(")[][()]}") shouldEqual 0
  }
}
