package lesson9

/**
  * SCORE 100%
  *
  * Detected time complexity: O(N)
  *
  * https://rafal.io/posts/codility-max-double-slice-sum.html
  *
  * We can use Kadane’s algorithm from two directions.
  *
  * A non-empty array A consisting of N integers is given.
  *
  * A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.
  *
  * The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].
  *
  * For example, array A such that:
  *
  * A[0] = 3
  * A[1] = 2
  * A[2] = 6
  * A[3] = -1
  * A[4] = 4
  * A[5] = 5
  * A[6] = -1
  * A[7] = 2
  * contains the following example double slices:
  *
  * double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
  * double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
  * double slice (3, 4, 5), sum is 0.
  * The goal is to find the maximal sum of any double slice.
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given a non-empty array A consisting of N integers, returns the maximal sum of any double slice.
  *
  * For example, given:
  *
  * A[0] = 3
  * A[1] = 2
  * A[2] = 6
  * A[3] = -1
  * A[4] = 4
  * A[5] = 5
  * A[6] = -1
  * A[7] = 2
  * the function should return 17, because no double slice of array A has a sum of greater than 17.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [3..100,000];
  * each element of array A is an integer within the range [−10,000..10,000].
  */
object MaxDoubleSliceSum {

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12

    val n = a.length
    val K1 = Array.ofDim[Int](n)
    val K2 = Array.ofDim[Int](n)

    for(i <- 1 until n-1){
      K1(i) = Math.max(K1(i - 1) + a(i), 0)
    }
    for(i <- n -2 until 1 by -1){
      K2(i) = Math.max(K2(i + 1) + a(i), 0)
    }

    var max = 0

    for(i <- 1 until n-1){
      max = Math.max(max, K1( i -1) + K2( i + 1 ))
    }
    max

  }

}
