package lesson12

import org.scalatest._

class GcdSpec extends FlatSpec with Matchers {
  "The GcdSpec)" should "not fail" in {
    Gcd.bySubtraction(18, 2) shouldEqual 2
    Gcd.bySubtraction(24, 9) shouldEqual 3
    Gcd.gcd(18, 2) shouldEqual 2
    Gcd.gcd(24, 9) shouldEqual 3
    Gcd.byBinary(18, 2, 1) shouldEqual 2
    Gcd.byBinary(24, 9, 1) shouldEqual 3
  }
}
