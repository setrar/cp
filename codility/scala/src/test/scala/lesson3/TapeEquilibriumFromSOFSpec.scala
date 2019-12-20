package lesson3

import org.scalatest._

class TapeEquilibriumFromSOFSpec extends FlatSpec with Matchers {
  "The TapeEquilibriumFromJava for Array(3, 1, 2, 4, 3)" should "equal 1" in {
    TapeEquilibriumFromSOF.solution(Array(3, 1, 2, 4, 3)) shouldEqual 1
  }
}
