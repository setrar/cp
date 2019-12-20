package lesson2

import org.scalatest._

class CyclicRotationListSpec extends FlatSpec with Matchers {
  "The solution Rotating Array( 3, 8, 9, 7, 6 ) by 3" should "be Array(9, 7, 6, 3, 8)" in {
    CyclicRotationList.solution(Array( 3, 8, 9, 7, 6 ), 3) shouldEqual Array(9, 7, 6, 3, 8)
  }
  "The solution Rotating Array( 0, 0, 0) by 1" should "be Array( 0, 0, 0)" in {
    CyclicRotationList.solution(Array[Int]( 0, 0, 0), 1) shouldEqual Array(0, 0, 0)
  }
  "The solution Rotating Array( 1, 2, 3, 4 ) by 4" should "be Array( 1, 2, 3, 4 )" in {
    CyclicRotationList.solution(Array[Int]( 1, 2, 3, 4 ), 4) shouldEqual Array(1, 2, 3, 4)
  }
}
