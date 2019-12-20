package lesson5

import org.scalatest._

class MinAvgTwoSliceSpec extends FlatSpec with Matchers {
  "The MinAvgTwoSliceSpec" should "not fail" in {
    val a = Array(4,2,2,5,1,5,8)
    MinAvgTwoSlice.solution(a) shouldEqual 1
  }
}
