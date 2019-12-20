package lesson2

/**
  * SCORE 88%
  *
  * Detected time complexity: O(N) or O(N*log(N))
  *
  * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
  *
  * For example, in array A such that:
  *
  * A[0] = 9  A[1] = 3  A[2] = 9
  * A[3] = 3  A[4] = 9  A[5] = 7
  * A[6] = 9
  * the elements at indexes 0 and 2 have value 9,
  * the elements at indexes 1 and 3 have value 3,
  * the elements at indexes 4 and 6 have value 9,
  * the element at index 5 has value 7 and is unpaired.
  * Write a function:
  *
  * object Solution { def solution(a: Array[Int]): Int }
  *
  * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
  *
  * For example, given array A such that:
  *
  * A[0] = 9  A[1] = 3  A[2] = 9
  * A[3] = 3  A[4] = 9  A[5] = 7
  * A[6] = 9
  * the function should return 7, as explained in the example above.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an odd integer within the range [1..1,000,000];
  * each element of array A is an integer within the range [1..1,000,000,000];
  * all but one of the values in A occur an even number of times.
  */
object OddOccurrencesInArray {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val ar: Array[Int] = Array.ofDim[Int](a.toList.max + 1)
    for (i <- a.indices) ar(a(i)) = ar(a(i)) + 1
    for (i <- ar.indices) if (ar(i) % 2 == 1) return i
    -1
  }
  def stillSlowSolution(a: Array[Int]): Int = {
    def dups[T](list: List[T]) =
      list
        .foldLeft((Set.empty[T], Set.empty[T]))
        { case ((seen, duplicates), cur) =>
          if(seen(cur)) (seen, duplicates + cur) else (seen + cur, duplicates)
        }._2
    val xs = a.toList
    val dup = dups(xs)
    // filter duplicates
    xs.filterNot(dup) match {
      case Nil => 0
      case x :: _ => x
    }
  }
    def slowSolution(a: Array[Int]): Int = {
    val xs = a.toList
    // find duplicates
    val dup = xs.groupBy(identity).collect {
      case (x, List(_, _, _*)) => x
    }.toSet
    // filter duplicates
    xs.filterNot(dup) match {
      case Nil => 0
      case x :: _ => x
    }
  }

  def frog(X: Int, A: Array[Int]): Int = {
    var steps = X
    val bitmap = new Array[Boolean](steps + 1)
    var i = 0
    while ( {i < A.length}) {
      if (!bitmap(A(i))) {
        bitmap(A(i)) = true
        steps -= 1
      }
      if (steps == 0) return i

      {
        i += 1; i - 1
      }
    }
    -1
  }
}
