package introduction

import org.scalatest._

class ReverseAListSpec extends FlatSpec with Matchers {
  "The ReverseAListSpec" should "not fail" in {
    val i = List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0)
    val o = List(0, 28, 4, 18, 17, 26, 28, 3, 22, 19)
    ReverseAList.f(i) shouldEqual o
    ReverseAList.f1(i) shouldEqual o
    ReverseAList.f2(i) shouldEqual o
    ReverseAList.f3(i) shouldEqual o
    ReverseAList.f4(i) shouldEqual o
  }
}
