package lesson2

object Rotate {

  def rotate[T](list: List[T], n: Int = 1): List[T] = {
    val shift = n % list.size
    if (shift == 0) list
    else {
      val count = if (shift > 0) shift else list.size + shift
      list.drop(count) ::: list.take(count)
    }
  }

  def solution(a: Array[Int], k: Int): Array[Int] = {
    rotate(a.toList, k)
    Nil.toArray
  }

}
