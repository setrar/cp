package strings

import org.scalatest._

class CaesarCipherSpec extends FlatSpec with Matchers {
  "The CaesarCipherSpec" should "not fail" in {
    CaesarCipher.caesarCipher("middle-Outz", 2) shouldEqual "okffng-Qwvb"
  }
}
