package warmup

object PlusMinus {

  def plusMinus(arr: Array[Int]): Array[Double] = {
    val n = arr.length

    case class Count(n: Int = 0, p: Int = 0, z: Int = 0)

    val count = arr.foldLeft(Count()){ (acc,x) =>
      (x: @annotation.switch) match {
        case _ if x < 0 => acc.copy(n = acc.n + 1)
        case _ if x > 0 => acc.copy(p = acc.p + 1)
        case _ if x == 0 => acc.copy(z = acc.z + 1)
      }
    }

    def precision(n: Double): Double =
      BigDecimal(n).setScale(6, BigDecimal.RoundingMode.HALF_UP).toDouble

    val neg: Double = precision(count.n.toDouble/n)
    val pos: Double = precision(count.p.toDouble/n)
    val zer: Double = precision(count.z.toDouble/n)

    println(f"$pos%1.6f\n$neg%1.6f\n$zer%1.6f")

    Array(pos,neg,zer)
  }

}
