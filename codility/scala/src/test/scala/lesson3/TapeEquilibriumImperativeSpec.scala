package lesson3

import org.scalatest._

class TapeEquilibriumImperativeSpec extends FlatSpec with Matchers {
  /* Result 23, 15 % */
  "The TapeEquilibrium for Array(3, 1, 2, 4, 3)" should "equal 1" in {
    TapeEquilibriumImperative.solution(Array(3, 1, 2, 4, 3)) shouldEqual 1
  }
}
