package lesson2

import org.scalatest._

class CyclicRotationFirstDuplicateSpec extends FlatSpec with Matchers {
  "The CyclicRotationFirstDuplicateSpec" should "not fail" in {
    CyclicRotationFirstDuplicate.solution(Array[Int]( 3, 8, 9, 7, 6 )) shouldEqual 11
    CyclicRotationFirstDuplicate.solution(Array[Int]( 0, 0, 0)) shouldEqual 0
    CyclicRotationFirstDuplicate.solution(Array[Int]( 1, 2, 3, 4 )) shouldEqual 5
  }
}
