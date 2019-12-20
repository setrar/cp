package lesson3

object TapeEquilibriumMinImperative {
  def solution(a: Array[Int]): Int = {
    val xs: Stream[Int] = a.toStream
    var min = 0
    var curr = xs.head
    for (i <- a.indices) {
      min = Math.abs(xs.take(i).sum - xs.drop(i).sum)
      if (min < curr) curr = min
    }
    curr
  }
}
