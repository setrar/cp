package lesson8

/**
  * SCORE 91%
  *
  * Detected time complexity: O(N*log(N)) or O(N)
  *
  * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
  *
  * For example, consider array A such that
  *
  * A[0] = 3    A[1] = 4    A[2] =  3
  * A[3] = 2    A[4] = 3    A[5] = -1
  * A[6] = 3    A[7] = 3
  * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
  *
  * Write a function
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
  *
  * For example, given array A such that
  *
  * A[0] = 3    A[1] = 4    A[2] =  3
  * A[3] = 2    A[4] = 3    A[5] = -1
  * A[6] = 3    A[7] = 3
  * the function may return 0, 2, 4, 6 or 7, as explained above.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [0..100,000];
  * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
  *
  */
object Dominator {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val n = a.length

    var size = 0
    var value = -1
    for (i <- 0 until n) {
      if (size == 0) {
        size = size + 1
        value = a(i)
      } else
      if (value != a(i))
        size = size - 1
      else
        size = size + 1
    }

    var candidate = -1
    var leader = -1
    var count = 0

    if (size > 0)
      candidate = value

    for (k <- 0 until n)
      if (a(k) == candidate)
        count = count + 1

    if (count >= n / 2)
      leader = candidate

    a.indexOf(leader)
  }
}
