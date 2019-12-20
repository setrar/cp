package warmup

object DiagonalDifference {

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    val n = arr.length

    case class Sum(left: Int = 0, right: Int = 0)

    val sum = arr.indices.foldLeft(Sum()){ (acc, x) =>
      acc.copy(
          left = acc.left + arr(x)(x)
        , right = acc.right + arr(x)((n - 1) - x)
      )
    }

    Math.abs(sum.left - sum.right)
  }

}
