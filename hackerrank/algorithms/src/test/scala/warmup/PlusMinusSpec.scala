package warmup

import org.scalatest._

class PlusMinusSpec extends FlatSpec with Matchers {
  "The PlusMinusSpec" should "not fail" in {
    PlusMinus.plusMinus(Array(-4,3,-9,0,4,1)) shouldEqual Array(0.5000000,0.333333,0.166667)
  }
}
