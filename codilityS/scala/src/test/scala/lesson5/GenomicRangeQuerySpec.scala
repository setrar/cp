package lesson5

import org.scalatest._

class GenomicRangeQuerySpec extends FlatSpec with Matchers {
  "The GenomicRangeQuerySpec" should "not fail" in {
    val s = "CAGCCTA"
    val p = Array(2, 5 ,0)
    val q = Array(4, 5, 6)
    GenomicRangeQuery.solution(s,  p, q) shouldEqual Array(2, 4, 1)

  }
}
