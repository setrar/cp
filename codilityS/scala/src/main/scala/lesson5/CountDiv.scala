package lesson5

object CountDiv {


  /**
    *
    * SCORE 100%
    *
    * https://app.codility.com/demo/results/trainingY599QR-ZFC/
    *
    * Write a function:
    *
    * object Solution { def solution(a: Int, b: Int, k: Int): Int }
    *
    * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
    *
    * { i : A ≤ i ≤ B, i mod K = 0 }
    *
    * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
    *
    * Write an efficient algorithm for the following assumptions:
    *
    * A and B are integers within the range [0..2,000,000,000];
    * K is an integer within the range [1..2,000,000,000];
    * A ≤ B.
    *
    */
  def solution(a: Int, b: Int, k: Int): Int = {
    b/k - a/k + (if (a % k == 0) 1 else 0)
  }



  /**
    *
    * Slow 50%
    *
    * https://app.codility.com/demo/results/trainingZ6BMJ3-B2C/
    */
  def recursionSolution(a: Int, b: Int, k: Int): Int = {

    def loop(i: Int, acc: Int): Int =
      if (i > b) acc
      else
        if (i % k == 0)
          loop(i + 1, acc + 1)
        else
          loop(i + 1, acc)

    loop(a,0)
  }


  /**
    *
    * Slow 12%
    *
    *  https://app.codility.com/demo/results/training5A4KSA-WPY/
    */
  def fpSolution(a: Int, b: Int, k: Int): Int = {
    // write your code in Scala 2.12
    (a until b).count(_ % k == 0)
  }

}
