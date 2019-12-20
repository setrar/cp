package lesson1

import org.scalatest._

class BinaryGapSpec extends FlatSpec with Matchers {
  "The BinaryGapSpec" should "should not fail" in {
    BinaryGap.solution(15) shouldEqual 0
    BinaryGap.solution(328) shouldEqual 2
    BinaryGap.solution(42) shouldEqual 1
    BinaryGap.solution(51712) shouldEqual 2
    BinaryGap.solution(561892) shouldEqual 3
    BinaryGap.solution(1376796946) shouldEqual 5
  }
}
