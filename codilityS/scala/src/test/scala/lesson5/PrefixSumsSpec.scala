package lesson5

import org.scalatest._

class PrefixSumsSpec extends FlatSpec with Matchers {
  "The PrefixSumsSpec" should "not fail" in {
    val a = Array(1,2,3,4,5,6)
    PrefixSums.prefix_sums(a).toList shouldEqual a.scan(0)(_ + _)
    val spots = Array(2,3,7,5,1,3,9)
    PrefixSums.mushrooms(spots,4,6) shouldEqual 25
    PrefixSums.solutions(spots,4,6) shouldEqual 25

  }
}
