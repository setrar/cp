package lesson3

import org.scalatest._

class FrogJmpSpec extends FlatSpec with Matchers {
  "The FrogJmp for multiple" should "equal mtpl" in {
    FrogJmp.solution(10, 85, 30) shouldEqual 3
    FrogJmp.solution(10, 10, 20) shouldEqual 0
    FrogJmp.solution(10, 50, 10) shouldEqual 4
    FrogJmp.solution(0, 50, 10) shouldEqual 5
  }
}
