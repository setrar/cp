package warmup

object MiniMaxSum {

  /**
    * Taken from
    * https://www.hackerrank.com/chuckwondo
    */
  def miniMaxSum(arr: Array[Long]): Array[Long] = {

    case class Sum(sum: Long = 0, min: Long = Long.MaxValue, max: Long = Long.MinValue)

    val r = arr.foldLeft(Sum()){ (acc,x) =>
      acc.copy(sum = acc.sum + x, Math.min(acc.min, x),Math.max(acc.max, x))
    }

    println(s"${r.sum - r.max} ${r.sum - r.min}")

    Array(r.sum - r.max,r.sum - r.min)
  }

  /**
    * Version where value at index (x) is subtracted
    *
    * PASS
    */
  def miniMaxSum1(arr: Array[Long]): Array[Long] = {

    val sum = arr.sum
    case class Sum(min: Long = Long.MaxValue, max: Long = Long.MinValue)

    val r = arr.indices.foldLeft(Sum()){ (acc,x) =>
      val curr = sum - arr(x)
      acc.copy(Math.min(curr, acc.min),Math.max(curr, acc.max))
    }

    println(s"${r.min} ${r.max}")

    Array(r.min,r.max)
  }

  /**
    * Version where array is sliced by left and right
    *
    * PASS
    */
  def miniMaxSum2(arr: Array[Long]): Array[Long] = {
    val lst = arr.toList
    case class Sum(min: Long = Long.MaxValue, max: Long = Long.MinValue)

    val r = arr.indices.foldLeft(Sum()){ (acc,x) =>
      val curr = lst.slice(0,x).sum + lst.slice(x + 1,arr.length).sum
      acc.copy(Math.min(curr, acc.min),Math.max(curr, acc.max))
    }

    println(s"${r.min} ${r.max}")

    Array(r.min,r.max)
  }

}
