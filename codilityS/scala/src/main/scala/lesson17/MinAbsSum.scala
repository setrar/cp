package lesson17

/**
  * SCORE 100%
  *
  * https://codility.com/media/train/solution-min-abs-sum.pdf
  *
  * Detected time complexity: O(N * max(abs(A))**2)
  *
  * For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:
  *
  * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
  *
  * (Assume that the sum of zero elements equals zero.)
  *
  * For a given array A, we are looking for such a sequence S that minimizes val(A,S).
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.
  *
  * For example, given array:
  *
  * A[0] =  1
  * A[1] =  5
  * A[2] =  2
  * A[3] = -2
  * your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [0..20,000];
  * each element of array A is an integer within the range [−100..100].
  */
object MinAbsSum {

  def solution(a: Array[Int]): Int = {
    val n = a.length
    var m = 0
    for (i <- a.indices) {
      a(i) = Math.abs(a(i))
      m = Math.max(a(i), m)
    }
    val s = a.sum
    val count = Array.ofDim[Int](m + 1)
    for (i <- 0 until n) {
      count(a(i)) += 1
    }
    val dp = Array.fill[Int](s + 1)(-1)
    dp(0) = 0
    for (a <- 1 until m + 1) {
      if (count(a) > 0) {
        for (j <- 0 until s) {
          if (dp(j) >= 0)
            dp(j) = count(a)
          else if (j >= a && dp(j - a) > 0)
            dp(j) = dp(j - a) - 1
        }
      }
    }
    var result = s
    for (i <- 0 until (s / 2 + 1)) {
      if (dp(i) >= 0)
        result = Math.min(result, s - 2 * i)
    }
    result
  }

}
