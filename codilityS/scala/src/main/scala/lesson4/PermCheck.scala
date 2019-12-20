package lesson4

/** SCORE 100%
  * A non-empty array A consisting of N integers is given.
  *
  * A permutation is a sequence containing each element from 1 to N once, and only once.
  *
  * For example, array A such that:
  *
  * A[0] = 4
  * A[1] = 1
  * A[2] = 3
  * A[3] = 2
  * is a permutation, but array A such that:
  *
  * A[0] = 4
  * A[1] = 1
  * A[2] = 3
  * is not a permutation, because value 2 is missing.
  *
  * The goal is to check whether array A is a permutation.
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
  *
  * For example, given array A such that:
  *
  * A[0] = 4
  * A[1] = 1
  * A[2] = 3
  * A[3] = 2
  * the function should return 1.
  *
  * Given array A such that:
  *
  * A[0] = 4
  * A[1] = 1
  * A[2] = 3
  * the function should return 0.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [1..100,000];
  * each element of array A is an integer within the range [1..1,000,000,000].
  */
object PermCheck {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    def loop(xs: List[Int]): Int = {
      if (xs.tail.isEmpty) 1
      else if (xs.tail.head != xs.head + 1) 0
      else loop(xs.tail)
    }

    val xs: List[Int] = a.toList.sorted

    if (xs.head != 1) 0
    else if (xs.last != xs.size) 0
    else loop(xs)
  }
}
