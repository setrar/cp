package lesson3

object TapeEquilibrium {

  def solution(a: Array[Int]): Int = {
    val sum = a.sum
    val leftAcc = a(0)

    val startingIndex = 2

    def go(p: Int, leftAcc: Int)(min: Int): Int =
      if (p == a.length) min
      else go(p + 1, leftAcc + a(p - 1))(Math.min(min, Math.abs(leftAcc - (sum - leftAcc))))

    go(startingIndex, leftAcc)(Math.abs(leftAcc - (sum - leftAcc)))
  }
}
