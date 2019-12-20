package introduction

object ReverseAList {

  /**
    *
    * Reverse a list without using reverse
    *
    * https://www.hackerrank.com/challenges/fp-reverse-a-list/forum
    */
  def f(arr:List[Int]):List[Int] = arr.foldLeft(List[Int]())((acc,v) => v::acc)

  /**
    * 1) Very ugly solution but it works
    * 2) Weird but it works
    */
  def f1(arr:List[Int]):List[Int] = arr.foldRight("")( (x, y) => y + "," + x).split(",").toList.tail.map(_.toInt)
  def f2(arr:List[Int]):List[Int] = arr.inits.toList.init.map(_.last)

  /**
    * Just using by Range
    * with Functor (map) and Monad (flatMap)
    */
  def f3(arr:List[Int]):List[Int] = ((arr.size - 1) to 0 by -1).map(x => arr(x)).toList
  def f4(arr:List[Int]):List[Int] = ((arr.size - 1) to 0 by -1).flatMap(x => List(arr(x))).toList

}
