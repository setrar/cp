package lesson12

object ChocolatesByNumbers {


  /**
    *
    * SCORED 100%
    *
    * Detected time complexity: O(log(N + M))
    *
    * Better GCD Solution
    *
    * purely mathematical solution
    *
    * https://app.codility.com/demo/results/trainingF32TUW-MW2/
    *
    *
    * https://github.com/ZRonchy/Codility/blob/master/Lesson10/ChocolatesByNumbers.java
    *
    */
  def solution(n: Int, m: Int): Int = {
    // write your code in Scala 2.12

    def gcd(p: Int, q: Int): Int =
      if (p % q == 0)
        q
      else
        gcd(q, p % q)

    n / gcd(n,m)

  }

  /**
    * Scored 75 %
    *  https://app.codility.com/demo/results/trainingQ7UP3M-P2J/
    *
    *
    *  Bad Performance Test
    *
    *  For example, for the input (1000000000, 1) the solution exceeded the time limit.
    *
    *
    */
  def recursionSolution(n: Int, m: Int): Int = {
    // write your code in Scala 2.12

    def loop(x: Int, acc: Int): Int = {
      if (x == 0 || n == 1) acc + 1
      else loop((x + m) %n, acc + 1)
    }

    loop(m, 0)
  }
}
