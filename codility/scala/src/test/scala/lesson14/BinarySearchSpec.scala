package lesson14

import org.scalatest._

class BinarySearchSpec extends FlatSpec with Matchers {
  "The MinMaxDivisionSpec" should "not fail" in {
    BinarySearch.binarySearch(Array(1,2,3,4,5,6,7,8,9),4) shouldEqual 3
  }
}
