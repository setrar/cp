package lesson10

object CountFactors {

  /**
    *
    * SCORE 71%
    *
    * https://app.codility.com/demo/results/trainingH8SBCH-VW3/
    */
  def slowsolution1(n: Int): Int = {
    // write your code in Scala 2.12
    var res = 1
    for (x <- 1 until n) { if (n % x == 0) res = res + 1}
    res
  }

  /**
    *
    * SCORE 57%
    *
    * https://app.codility.com/demo/results/trainingS7ZUQW-F9K/
    */
  def slowsolution2(n: Int): Int = {
    // write your code in Scala 2.12
    val s = for (x <- 1 until n) yield { if (n % x == 0) x else 1 }
    s.distinct.length + 1
  }
}
