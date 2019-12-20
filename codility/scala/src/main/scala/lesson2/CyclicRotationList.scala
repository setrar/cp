package lesson2

object CyclicRotationList {

  def rotateLeft[A](list: List[A], i: Int): List[A] = {
    val size = list.size
    list.drop(i % size) ::: list.take(i % size)
  }

  def rotateRight[A](list: List[A], i: Int): List[A] = {
    val size = list.size
    list.drop(size - (i % size)) ::: list.take(size - (i % size))
  }

  /**
    * 37 %
    * @param a
    * @param k
    * @return
    */
  def solution(a: Array[Int], k: Int): Array[Int] = {
    {
      if (k %2 == 0)
        rotateLeft(a.toList, k)
      else
        rotateRight(a.toList, k)
    }.toArray
  }

}
