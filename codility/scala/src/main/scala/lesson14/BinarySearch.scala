package lesson14

object BinarySearch {

  def binarySearch(a: Array[Int], x: Int): Int = {
    val n = a.length

    var beg = 0
    var end = n - 1
    var result = -1
    while (beg <= end) {
      val mid = (beg + end) / 2
      if (a(mid) <= x) {
        beg = mid + 1
        result = mid
      } else {
        end = mid - 1
      }
    }
    result
  }

}
