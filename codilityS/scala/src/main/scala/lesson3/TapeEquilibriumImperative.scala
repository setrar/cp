package lesson3

object TapeEquilibriumImperative {
  def solution(a: Array[Int]): Int = {
    val xs: List[Int] = a.toList
    var min = 0
    var curr = xs.sum
    for (i <- a.indices) {
      min = Math.abs(xs.take(i).sum - xs.drop(i).sum)
      if (min < curr) curr = min
    }
    curr
  }
}
