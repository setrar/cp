package lesson3

/**
  * 100%
  */
object FrogJmp {
  def solution(x: Int, y: Int, d: Int): Int = {
    // write your code in Scala 2.12
    val distance: Long = y - x
    val minimum = distance / d
    if (distance % d > 0) (minimum + 1).toInt
    else minimum.toInt
  }
}
