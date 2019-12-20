package introduction

object ListLength {

  def f(arr:List[Int]):Int = arr.fold(0)( (acc,_) => acc + 1)

}
