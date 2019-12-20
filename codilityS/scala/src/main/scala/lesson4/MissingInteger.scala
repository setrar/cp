package lesson4

/**
  * SCORE 100%
  *
  * Detected time complexity: O(N) or O(N * log(N))
  *
  * This is a demo task.
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
  *
  * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
  *
  * Given A = [1, 2, 3], the function should return 4.
  *
  * Given A = [−1, −3], the function should return 1.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [1..100,000];
  * each element of array A is an integer within the range [−1,000,000..1,000,000].
  */
object MissingInteger {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    def loop(in: Int, xs: List[Int]): Int = {
      if (xs.isEmpty || xs.head != in) in
      else loop(in + 1, xs.tail)
    }
    loop(1, a.toList.filter(_ > 0).distinct.sorted)
  }

}
