package lesson6

object Sorting {

  // https://www.programming-idioms.org/idiom/21/swap-values-of-variables-a-and-b/1447/scala
  def swap(a: Array[Int], p: Int , q:Int): Unit = {
    a(p)^=a(q)
    a(q)^=a(p)
    a(p)^=a(q)
  }
  //      swap(a,k,minimal)


  def selectionSort(a: Array[Int]): Array[Int] = {
    val n = a.length

    for (k <- 0 until n) {
      var minimal = k
      for (j <- k + 1 until n)
        if (a(j) < a(minimal))
          minimal = j
      a(k)^=a(minimal); a(minimal)^=a(k); a(k)^=a(minimal)
    }
    a
  }


  /**
    * https://stackoverflow.com/questions/1672074/selection-sort-in-functional-scala
    */
  def selectionSort(xs: List[Int]): List[Int] = {
    def maximum(xs: List[Int]): List[Int] =
      List(xs.head).foldLeft(xs.tail) {
        (ys, x) =>
          if(x > ys.head) x :: ys
          else            ys.head :: x :: ys.tail
      }

    def selectionSortHelper(xs: List[Int], accumulator: List[Int]): List[Int] =
      if(xs.isEmpty) accumulator
      else {
        val ys = maximum(xs)
        selectionSortHelper(ys.tail, ys.head :: accumulator)
      }

    selectionSortHelper(xs, Nil)
  }

}
