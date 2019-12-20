package lesson9

import org.scalatest._

class MaxDoubleSliceSumSpec extends FlatSpec with Matchers {
  "The MaxDoubleSliceSumSpec " should "not fail" in {
    MaxDoubleSliceSum.solution(Array(3, 2, 6, -1, 4, 5, -1, 2)) shouldEqual 17
  }
}
