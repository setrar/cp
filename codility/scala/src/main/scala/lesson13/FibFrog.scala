package lesson13

import util.control.Breaks._

object FibFrog {

  def solution(a: Array[Int]): Int = {
    val A: Array[Int] = Array.ofDim[Int](a.length + 1)
    A(a.length) = 1
    val N = A.length

    val fib_table = Array.fill[Int](27)(0)
    fib_table(1) = 1

    var IDX = 0
    breakable {
      for (idx <- 2 until 27) {
        fib_table(idx) = fib_table(idx - 1) + fib_table(idx - 2)
        IDX = idx
        if (fib_table(idx) > N) {
          break
        }
      }
    }

    // fib_table = fib_table[2:IDX] Python
    val fibTable = Array.ofDim[Int](IDX - 2)
    Array.copy(fib_table, 2, fibTable, 0, IDX - 2)

    val next_try = Array.fill[Int](N)(-1)
    for (idx <- fibTable.indices) {
      next_try(fibTable(idx) - 1) = 1
    }

    for ( (leaf,idx) <- A.zipWithIndex) {
      if (next_try(idx) > 0 && leaf == 1) {
        for (fib <- fibTable) {
          if (idx + fib >= N)
            break
          if (next_try(idx + fib) < 0 || next_try(idx + fib) > next_try(idx) + 1)
            next_try(idx + fib) = next_try(idx) + 1
        }
      }
    }

    next_try.last
  }

}
