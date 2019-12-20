package lesson13

import org.scalatest._

class FibSpec extends FlatSpec with Matchers {
  "The fib(100)" should "equal 3736710778780434371L" in {
    Solution.fibs(100) shouldEqual 3736710778780434371L
  }
  "The fib(8)" should "equal 21L" in {
    Solution.fibs(8) shouldEqual 21L
  }
}
