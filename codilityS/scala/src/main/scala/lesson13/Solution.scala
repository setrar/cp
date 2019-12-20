package lesson13

import scala.collection.immutable.Stream.cons

object Solution {

  def fibs: Stream[Long] = {
    def go(h: Long, n: Long): Stream[Long] =
      cons(h,go(n, h + n))
    go(0, 1)
  }

}
