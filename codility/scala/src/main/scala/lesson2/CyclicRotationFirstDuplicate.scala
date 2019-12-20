package lesson2

object CyclicRotationFirstDuplicate {

  /**
    * 100 % Performance Not Assessed
    *
    */
  def solution(a: Array[Int]): Int = {
    val xs = a.toList

    def loop(l: List[Int], acc: List[Int]): Int = {
      val out = acc.groupBy(identity).collect { case (x, List(_, _, _*)) => x }.nonEmpty
      if (out) acc.head
      else loop(l.tail.take(l.size - 1).:+(l.head), l.head + l.tail.head :: acc)
    }

    if (xs.isEmpty)
      0
    else
      loop(xs, Nil)
  }

}
