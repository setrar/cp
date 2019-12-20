package arrays

import org.scalatest._

class LeftRotationSpec extends FlatSpec with Matchers {
  "The LeftRotationSpec" should "should not fail" in {
    LeftRotation.rotLeft(Array(1,2,3,4,5),2) shouldEqual Array(3,4,5,1,2)
    LeftRotation.failedRotLeft(Array(1,2,3,4,5),2) shouldEqual Array(3,4,5,1,2)
  }
}
