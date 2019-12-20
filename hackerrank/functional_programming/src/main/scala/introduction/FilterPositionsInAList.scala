package introduction

object FilterPositionsInAList {


  /**
    * Return only odd positions
    */
  def f(arr: List[Int]): List[Int] = for ((a,b) <- arr.zipWithIndex if b % 2 ==1) yield a

  def f1(arr: List[Int]): List[Int] = arr.zipWithIndex.collect{ case (a, b) if b % 2 == 1 => a}

  def f2(arr: List[Int]): List[Int] = arr.indices.toList.filter(_ % 2 == 1).map(arr)

  def f3(arr: List[Int]): List[Int] = for ( x <- arr.indices.toList.filter(_ % 2 == 1)) yield arr(x)

  /**
    * Just using by Range
    */
  def f4(arr:List[Int]):List[Int] = (1 to arr.length by 2).map(arr).toList


}
