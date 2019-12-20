package introduction

import org.scalatest._

class ListLengthSpec extends FlatSpec with Matchers {
  "The ListLengthSpec" should "not fail" in {
    val i = List(0,2,1,3,4,8)
    ListLength.f(i) shouldEqual 6
  }
}
