package lesson2

import scala.annotation.tailrec

object CyclicRotationRecursion {

  /**
    * Grade 0%
    * @param a
    * @param k
    * @return
    */
  def solution(a: Array[Int], k: Int): Array[Int] = {
    @tailrec
    def go(a: Array[Int], acc: Int): Array[Int] = {
      val cond = if (k %2 == 0) acc <= k else acc >= k
      if (cond) a
      else go(a.drop(1) ++ a.take(1), acc + 1)
    }
    go(a, 1)
  }

}
