package lesson2

import scala.annotation.tailrec

object CyclicRotationMutatedRecursion {

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

  def init2[A](l: List[A]): List[A] = {
    import collection.mutable.ListBuffer
    val buf = new ListBuffer[A]
    @annotation.tailrec
    def go(cur: List[A]): List[A] = cur match {
      case Nil => sys.error("init of empty list")
      case _::Nil => List(buf.toList: _*)
      case h::t => buf += h; go(t)
    }
    go(l)
  }

}
