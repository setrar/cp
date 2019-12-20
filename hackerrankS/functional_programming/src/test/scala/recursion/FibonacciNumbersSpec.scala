package recursion

import org.scalatest._

class FibonacciNumbersSpec extends FlatSpec with Matchers {
  "The FibonacciNumbersSpec" should "not fail" in {
    FibonacciNumbers.fibonacci(6) shouldEqual 5
    FibonacciNumbers.fibonacci(9) shouldEqual 21
    FibonacciNumbers.fibonacci(47) shouldEqual 1836311903
  }
}
