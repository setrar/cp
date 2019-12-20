package introduction

object SumOfOddElements {
  def f(arr:List[Int]):Int = arr.filterNot(_ % 2 == 0).sum
  def f1(arr:List[Int]):Int = arr.filter(_ % 2 == 1).sum
}
