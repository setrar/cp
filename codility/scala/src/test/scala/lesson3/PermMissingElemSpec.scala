package lesson3

import org.scalatest._

class PermMissingElemSpec extends FlatSpec with Matchers {
  "The PermMissingElem for multiple" should "equal mtpl" in {
    PermMissingElem.solution(Array(2, 3, 1, 5)) shouldEqual 4
    PermMissingElem.solution(Array()) shouldEqual 1
    PermMissingElem.solution(Array(1)) shouldEqual 2
    PermMissingElem.solution(Array(4, 5, 3, 1)) shouldEqual 2
  }
}
