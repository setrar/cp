package lesson5

/**
  * SCORE 100%
  *
  * https://app.codility.com/demo/results/trainingBZJU4M-NXE/
  *
  * Detected time complexity: O(N)
  *
  * A non-empty array A consisting of N integers is given.
  * A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A
  * (notice that the slice contains at least two elements).
  *
  * The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice.
  * To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
  *
  * For example, array A such that:
  *
  * A[0] = 4
  * A[1] = 2
  * A[2] = 2
  * A[3] = 5
  * A[4] = 1
  * A[5] = 5
  * A[6] = 8
  * contains the following example slices:
  *
  * slice (1, 2), whose average is (2 + 2) / 2 = 2;
  * slice (3, 4), whose average is (5 + 1) / 2 = 3;
  * slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
  * The goal is to find the starting position of a slice whose average is minimal.
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given a non-empty array A consisting of N integers, returns the starting position of the slice with the minimal average.
  * If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.
  *
  * For example, given array A such that:
  *
  * A[0] = 4
  * A[1] = 2
  * A[2] = 2
  * A[3] = 5
  * A[4] = 1
  * A[5] = 5
  * A[6] = 8
  * the function should return 1, as explained above.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [2..100,000];
  * each element of array A is an integer within the range [−10,000..10,000].
  */
object MinAvgTwoSlice {
  def solution(a: Array[Int]): Int = {

    val n: Int = a.length

    /**
      * Let's initialize the prefixSums Array
      */
    val prefixSums: Array[Int] = a.scan(0)(_ + _)

    /**
      * Let's look for a Minimum that has:
      * a position and an average
      * (i.e. Product Type Data Structure)
      */
    case class Minimum(position: Int, average: Float)

    /**
      * Based on a Slice: Position [P] and [Q]
      * Q here is represented by its size [P - Q] (2 or 3)
      * CAPTURE only if there is a change in the minimum average
      */
    def average(p: Int, q: Int, min: Minimum): Minimum = {
      val average: Float = (prefixSums(p + q) - prefixSums(p)) / q.toFloat
      if (average < min.average) min.copy(position = p, average = average) else min
    }

    /**
      * Let's start by the first position
      * and a max average value
      */
    val init = Minimum(position = 0, average = Float.MaxValue)

    /**
      * Let's fold through the A Array indices minus one
      * (paying attention to the slice size)
      *
      * while capturing the minimum average.
      * If Q size reaches 3 (instead of regular slice tuple:
      *    capture the last minimum average
      *    otherwise return the current minimum average
      * give the minimal position
      */
    (0 until n - 1).toList
      .foldLeft(init) { (min, p) =>
        val currentMin = average(p, 2, min)
        if (p < n - 2) average(p, 3, currentMin) else currentMin
      }.position

  }

}
