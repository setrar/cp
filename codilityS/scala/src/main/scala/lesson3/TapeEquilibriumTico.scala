package lesson3

/**
  * https://github.com/ticofab/codility-scala-lessons
  */
object TapeEquilibriumTico {
  def solution(a: Array[Int]): Int = {
    val sum = a.sum

    def getDiff(sumLeft: Int, sumRight: Int): Int = Math.abs(sumLeft - sumRight)

    def findEq(P: Int, sumLeft: Int, curMin: Int): Int =
      if (P == a.length) curMin
      else findEq(P + 1, sumLeft + a(P - 1), Math.min(curMin, getDiff(sumLeft, sum - sumLeft)))

    findEq(2, a(0), getDiff(a(0), sum - a(0)))
  }
}
