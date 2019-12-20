package lesson3

/** SCORE 100%
  * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
  *
  * Your goal is to find that missing element.
  *
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given an array A, returns the value of the missing element.
  *
  * For example, given array A such that:
  *
  * A[0] = 2
  * A[1] = 3
  * A[2] = 1
  * A[3] = 5
  * the function should return 4, as it is the missing element.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [0..100,000];
  * the elements of A are all distinct;
  * each element of array A is an integer within the range [1..(N + 1)].
  */
object PermMissingElem {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    def loop(i: Int, xs: List[Int]): Int = {
      if (xs.isEmpty || xs.head != i + 1) i + 1
      else loop(i + 1, xs.tail)
    }
    if (a.length == 0) 1
    else loop(0, a.toList.sorted)
  }
}
