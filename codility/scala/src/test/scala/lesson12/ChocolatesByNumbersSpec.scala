package lesson12

import org.scalatest._

class ChocolatesByNumbersSpec extends FlatSpec with Matchers {
  "The ChocolatesByNumbersSpec)" should "not fail correctness tests" in {
    // Example tests
    ChocolatesByNumbers.recursionSolution(n = 10, m = 4) shouldEqual 5
    // Correctness tests
    ChocolatesByNumbers.recursionSolution(n = 1, m = 1) shouldEqual 1
    ChocolatesByNumbers.recursionSolution(n = 2, m = 1) shouldEqual 2

    // Example tests
    ChocolatesByNumbers.solution(n = 10, m = 4) shouldEqual 5
    // Correctness tests
    ChocolatesByNumbers.solution(n = 1, m = 1) shouldEqual 1
    ChocolatesByNumbers.solution(n = 2, m = 1) shouldEqual 2

  }
}
