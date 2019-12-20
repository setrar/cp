package lesson2

object CyclicRotation {

  /**
    * 100 % Performance Not Assessed
    * @param a
    * @param k
    * @return
    */
  def solution(a: Array[Int], k: Int): Array[Int] = {
    {
      val xs = a.toList

      def loop(l: List[Int], k: Int): List[Int] =
        if (k == 0) l
        else loop(l.take(l.size - 1).+:(l.last), k - 1)

      if (xs.isEmpty)
        xs
      else
        loop(xs, k)
    }.toArray
  }

}
