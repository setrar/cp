package introduction

import org.scalatest._

class FilterPositionsInAListSpec extends FlatSpec with Matchers {
  "The FilterPositionsInAListSpec" should "not fail" in {
    val i = List(8,15,22,1,10,6,2,18,18,1)
    val o = List(15, 1, 6, 18, 1)
    FilterPositionsInAList.f(i) shouldEqual o
    FilterPositionsInAList.f1(i) shouldEqual o
    FilterPositionsInAList.f2(i) shouldEqual o
    FilterPositionsInAList.f3(i) shouldEqual o
    FilterPositionsInAList.f4(i) shouldEqual o
  }
}
