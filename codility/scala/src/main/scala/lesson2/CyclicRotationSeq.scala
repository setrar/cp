package lesson2

object CyclicRotationSeq {

  def rotateLeft[A](seq: Seq[A], i: Int): Seq[A] = {
    val size = seq.size
    seq.drop(i % size) ++ seq.take(i % size)
  }

  def rotateRight[A](seq: Seq[A], i: Int): Seq[A] = {
    val size = seq.size
    seq.drop(size - (i % size)) ++ seq.take(size - (i % size))
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
        rotateLeft(a, k)
      else
        rotateRight(a, k)
    }.toArray
  }

}
