package problems

import org.scalatest._

class FibonacciWordsSpec extends FlatSpec with Matchers {
  "The FibonacciWordsSpec" should "not fail" in {
    val t = Array.fill[Tuple3[String,String,Long]](2)(("","",0L))
    t(0) = ("1415926535","8979323846",35)
    FibonacciWords.fibonacciWords(t) shouldEqual "9"

    val a1 = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"
    val b1 = "8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196"
    val n1 = 104683731294243150L
    FibonacciWords.fibonacciWords(a1, b1, n1) shouldEqual "800000000"
  }
}
