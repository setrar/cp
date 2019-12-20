package strings

import org.scalatest._

class StrongPasswordSpec extends FlatSpec with Matchers {
  "The StrongPasswordSpec" should "not fail" in {
    StrongPassword.minimumNumber(3,"Ab1") shouldEqual 3
    StrongPassword.minimumNumber(11,"#HackerRank") shouldEqual 1
    StrongPassword.minimumNumber(2,"12") shouldEqual 4
    StrongPassword.minimumNumber(4,"4700") shouldEqual 3
  }
}
