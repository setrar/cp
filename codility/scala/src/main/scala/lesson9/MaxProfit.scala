package lesson9

object MaxProfit {

  /**
    *
    * SCORE 55%
    *
    * https://app.codility.com/demo/results/trainingKF6AST-XMB/
    *
    */
  def solution(a: Array[Int]): Int = {

    case class Profit(buy: Int = Int.MaxValue, sell: Int = Int.MinValue)

    val profit = a.indices.foldLeft(Profit()){(acc,x) =>
      val buy = Math.min(a(x),acc.buy)
      if (buy < acc.buy)
        Profit(buy,Int.MinValue)
      else
        Profit(buy,Math.max(a(x),acc.sell))
    }
    profit.sell - profit.buy match {
      case x if x == Int.MinValue || x == Int.MaxValue => 0
      case x => x
    }
  }

}
