package lesson5

/**
  * https://stackoverflow.com/questions/19552754/java-codility-training-genomic-range-query
  *
  * https://app.codility.com/demo/results/trainingKHXNBD-TGP/
  *
  *
  */
object GenomicRangeQuery {

  def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {

    val n = s.length

    /**
      * Array Manipulaton Functions
      */
    def arr: Array[Long] = Array.fill[Long](n + 1)(0L)
    def inc(z: Array[Long])(implicit i: Int): Unit = z(i) = z(i - 1) + 1L
    def shift(z: Array[Long])(implicit i: Int): Unit = z(i) = z(i - 1)

    val a = arr
    val c = arr
    val g = arr
    val t = arr

    for (i <- 1 to n) { implicit val index = i
      (s(i - 1): @annotation.switch) match {
        case 'A' => inc(a); shift(c); shift(g); shift(t);
        case 'C' => shift(a); inc(c); shift(g); shift(t);
        case 'G' => shift(a); shift(c); inc(g); shift(t);
        case 'T' => shift(a); shift(c); shift(g); inc(t);
      }
    }

    {
      for (i <- p.indices) yield {
        val start = p(i)
        val end = q(i) + 1
        if (a(start) != a(end)) 1
        else if (c(start) != c(end)) 2
        else if (g(start) != g(end)) 3
        else if (t(start) != t(end)) 4
        else 0
      }
    }.toArray

  }

  def slowSolution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {

    import scala.collection.mutable

    for (ind <- p.indices) yield {
      val sub = s.substring(p(ind), q(ind) + 1)
      if (sub.contains("A")) 1
      else if (sub.contains("C")) 2
      else if (sub.contains("G")) 3
      else 4
    }
  }.toArray
}
