package introduction

object EvaluatingEofX {

  def evaluatingEofX(n: Int, arr: Array[Double]): Array[Double] = {

    def fact(y: Int): Double = Range(1,y + 1).product.toDouble

    def power(x: Double, y: Int): Double = (0 until y).foldLeft(1.0){ (acc, _) => x * acc}

    def round(x: Double): Double = BigDecimal(x).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble

    for (i <- 0 until n) yield round{
      (1 until 10).foldLeft(1.0) { (acc, z) =>
        power(arr(i), z) / fact(z) + acc
      }
    }

  }.toArray

}
