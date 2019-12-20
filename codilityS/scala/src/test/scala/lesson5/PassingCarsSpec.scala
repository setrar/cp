package lesson5

import org.scalatest._

class PassingCarsSpec extends FlatSpec with Matchers {
  "The PassingCarsSpec" should "not fail" in {
    val a = Array(0,1,0,1,1)
    PassingCars.solution(a) shouldEqual 5
    PassingCars.imperativeSolution(a) shouldEqual 5
  }
}
