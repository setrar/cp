package warmup

import org.scalatest._

class DiagonalDifferenceSpec extends FlatSpec with Matchers {
  "The DiagonalDifferenceSpec" should "not fail" in {
    DiagonalDifference.diagonalDifference(Array(Array(1,2,3),Array(4,5,6),Array(9,8,9))) shouldEqual 2
    DiagonalDifference.diagonalDifference(Array(Array(11,2,4),Array(4,5,6),Array(10,8,-12))) shouldEqual 15
  }
}
