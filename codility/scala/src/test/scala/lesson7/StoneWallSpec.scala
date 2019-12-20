package lesson7

import org.scalatest._

class StoneWallSpec extends FlatSpec with Matchers {
  "The StoneWallSpec " should "not fail" in {
    StoneWall.solution(Array(8, 8, 5, 7, 9, 8, 7, 4, 8)) shouldEqual 7
  }
}
