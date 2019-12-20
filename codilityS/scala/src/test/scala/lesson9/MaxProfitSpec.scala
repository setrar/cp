package lesson9

import org.scalatest._

class MaxProfitSpec extends FlatSpec with Matchers {
  "The MaxProfitSpec " should "not fail" in {
    val A = Array(23171,21011,21123,21366,21013,21367)
    MaxProfit.solution(A) shouldEqual 356
  }
}
