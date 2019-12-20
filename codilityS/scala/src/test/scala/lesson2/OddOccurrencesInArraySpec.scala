package lesson2

import org.scalatest._

class OddOccurrencesInArraySpec extends FlatSpec with Matchers {
  "The solution for Array( 9, 3, 9, 3, 9, 7, 9)" should "be 7" in {
    OddOccurrencesInArray.solution(Array[Int]( 9, 3, 9, 3, 9, 7, 9)) shouldEqual 7
  }
}
