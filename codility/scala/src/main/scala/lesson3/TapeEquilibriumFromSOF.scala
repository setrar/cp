package lesson3

object TapeEquilibriumFromSOF {


  // https://stackoverflow.com/questions/19455058/tape-equilibrium-codility-training
  // https://app.codility.com/demo/results/demo9DAQ4T-2HS/

  def solution(a: Array[Int]): Int = {
    val N = a.length
    var sumRight = 0
    var sumLeft = 0
    var ans = 0L
    var i = 1
    while (i < N) {
      sumRight += a(i)
      i += 1
      i - 1
    }
    sumLeft = a(0)
    ans = Math.abs(Math.abs(sumRight) + Math.abs(sumLeft))
    var P = 1
    while (P < a.length) {
      if (Math.abs(Math.abs(sumLeft) - Math.abs(sumRight)) < ans)
        ans = Math.abs(Math.abs(sumLeft) - Math.abs(sumRight))

      sumLeft += a(P)
      sumRight -= a(P)
      P += 1
      P - 1
    }
    ans.toInt
  }

}
