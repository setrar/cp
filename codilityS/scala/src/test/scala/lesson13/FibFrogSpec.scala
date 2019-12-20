package lesson13

import org.scalatest._

class FibFrogSpec extends FlatSpec with Matchers {
  "The FibFrogSpec" should "not fail" in {
    FibFrog.solution(Array(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)) shouldEqual 3
  }
}
