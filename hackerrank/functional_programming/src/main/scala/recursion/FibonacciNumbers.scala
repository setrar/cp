package recursion

object FibonacciNumbers {

  /**
    * Using Binet's Formula
   */
  def fibonacci(x:Int):Int = {

    val n: Int = x - 1

    val sqrt5th: Double = 1 / Math.sqrt(5)

    def Phi: Double = (1 + Math.sqrt(5)) / 2

    def phi: Double = (1 - Math.sqrt(5)) / 2

    val res: Double =
      sqrt5th * Math.pow(Phi, n) -
        sqrt5th * Math.pow(phi, n)

    res.toInt
  }

}
