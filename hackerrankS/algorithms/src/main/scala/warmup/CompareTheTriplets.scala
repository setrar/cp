package warmup

object CompareTheTriplets {

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    case class Score(a: Int = 0, b: Int = 0)
    val res: Score = a.indices.foldLeft(Score()){ (acc, x) =>
      if (a(x) > b(x)) acc.copy(a = acc.a + 1)
      else if (a(x) < b(x)) acc.copy(b = acc.b + 1)
      else acc
    }
    Array(res.a, res.b)
  }


}
