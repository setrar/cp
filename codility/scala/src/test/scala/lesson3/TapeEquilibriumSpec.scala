package lesson3

import org.scalatest._

class TapeEquilibriumSpec extends FlatSpec with Matchers {
  "The TapeEquilibrium for Array(3, 1, 2, 4, 3)" should "equal 1" in {
    TapeEquilibrium.solution(Array(3, 1, 2, 4, 3)) shouldEqual 1
  }
  "The TapeEquilibrium for Array(3,1,3)" should "equal 1" in {
    TapeEquilibrium.solution(Array(3, 1, 3)) shouldEqual 3
  }
}
