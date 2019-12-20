package lesson4

/**
  * A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
  *
  * You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
  *
  * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
  *
  * For example, you are given integer X = 5 and array A such that:
  *
  * A[0] = 1
  * A[1] = 3
  * A[2] = 1
  * A[3] = 4
  * A[4] = 2
  * A[5] = 3
  * A[6] = 5
  * A[7] = 4
  * In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
  *
  * Write a function:
  *
  * object Solution { def solution(x: Int, a: Array[Int]): Int }
  * that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
  *
  * If the frog is never able to jump to the other side of the river, the function should return −1.
  *
  * For example, given X = 5 and array A such that:
  *
  * A[0] = 1
  * A[1] = 3
  * A[2] = 1
  * A[3] = 4
  * A[4] = 2
  * A[5] = 3
  * A[6] = 5
  * A[7] = 4
  * the function should return 6, as explained above.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N and X are integers within the range [1..100,000];
  * each element of array A is an integer within the range [1..X].
  */

object FrogRiverOne {
  def solution(x: Int, a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val pos: Array[Int] = Array.ofDim(x + 1)

    def findTime(step: Int, xs: List[Int]): Int = {
      def areAllLeavesInPlace = {
        def loop(i: Int): Boolean = {
          if (i == x + 1) true
          else if (pos(i) == 0) false
          else loop(i + 1)
        }
        loop(1)
      }

      if (xs.isEmpty) -1
      else {
        pos(xs.head) = pos(xs.head) + 1
        if (areAllLeavesInPlace)
          step
        else
          findTime(step + 1, xs.tail)
      }
    }

    findTime(0, a.toList)
  }
}
