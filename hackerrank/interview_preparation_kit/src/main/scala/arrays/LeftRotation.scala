package arrays

object LeftRotation {

  // Complete the rotLeft function below.
  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    val n = a.length
    for (_ <- 0 until d) {
      val t = a(0)
      for (j <- 1 until n) a(j - 1) = a(j)
      a(n - 1) = t
    }
    a
  }

  // Complete the rotLeft function below.
  def failedRotLeft(a: Array[Int], d: Int): Array[Int] = {
    // Recursive
    (0 until d).foldLeft(a.toList){ (acc,_) =>
        acc.tail.:+(acc.head)
    }.toArray
  }


}
