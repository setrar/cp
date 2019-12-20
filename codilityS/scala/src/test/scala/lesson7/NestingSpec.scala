package lesson7

import org.scalatest._

class NestingSpec extends FlatSpec with Matchers {
  "The NestingSpec " should "not fail" in {
    Nesting.solution("(()(())())") shouldEqual 1
    Nesting.solution("())") shouldEqual 0
  }
}
