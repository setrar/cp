package introduction

import org.scalatest._

class SumOfOddElementsSpec extends FlatSpec with Matchers {
  "The SumOfOddElementsSpec" should "not fail" in {
    val i = List(0,2,1,3,4,8)
    SumOfOddElements.f(i) shouldEqual 4
    SumOfOddElements.f1(i) shouldEqual 4
  }
}
