package lesson5

/**
  *
  * https://codility.com/media/train/3-PrefixSums.pdf
  *
  */
object PrefixSums {

  def count_total(p: Array[Int], x: Int, y: Int): Int = {
    p(y + 1) - p(x)
  }

  /**
    * Mushrooms solution in Scala Functional Programming
    */
  def solutions(a: Array[Int], spot: Int, moves: Int): Int = {
    val n: Int = a.length

    //prefix sums - scan inclusive in Scala
    val pref: Array[Int] = a.scan(0)(_ + _)

    def left(position: Int, result: Int): Int =
      if (position == (Math.min(moves, spot) + 1)) result
      else {
        val left_pos = spot - position
        val right_pos = Math.min(n - 1, Math.max(spot, spot + moves - 2 * position))
        left(position = position + 1, result = Math.max(result, count_total(pref, left_pos, right_pos)))
      }

    def right(position: Int, result: Int): Int =
      if (position == Math.min(moves + 1, n - spot)) result
      else {
        val right_pos = spot + position
        val left_pos = Math.max(0, Math.min(spot, spot - (moves - 2 * position)))
        right(position = position + 1, result = Math.max(result, count_total(pref, left_pos, right_pos)))
      }

    right(0, left(0, 0))

  }

  def prefix_sums(a: Array[Int]): Array[Int] = {
    val n = a.length
    val p = Array.fill[Int](n + 1)(0)
    for (k <- 1 until n + 1) {
      p(k) = p(k - 1) + a(k - 1)
    }
    p
  }

  def mushrooms(a: Array[Int], k: Int, m: Int): Int = {
    val n = a.length
    var result = 0
    val pref = prefix_sums(a)
    for (p <- 0 until (Math.min(m, k) + 1)) {
      val left_pos = k - p
      val right_pos = Math.min(n - 1, Math.max(k, k + m - 2 * p))
      result = Math.max(result, count_total(pref, left_pos, right_pos))
    }
    for (p <- 0 until Math.min(m + 1, n - k)) {
      val right_pos = k + p
      val left_pos = Math.max(0, Math.min(k, k - (m - 2 * p)))
      result = Math.max(result, count_total(pref, left_pos, right_pos))
    }
    result
  }
}
