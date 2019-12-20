package problems

import java.io.PrintWriter

/**
  * https://projecteuler.net/problem=230
  */
//    println(s"$t")
//    println(s"${t(n - 2).toString} ${t(n - 1).toString} ${t(n).toString} ${t(n + 1).toString}")
object FibonacciWords {
//object Solution {

  // Complete the FibonacciWords function below.
  def fibonacciWords(a: Array[List[Char]], b: Array[List[Char]], n: Array[Long]): String = {

    def fib( n : Int, s0: List[Char], s1: List[Char]) : List[Char] = n match {
      case 0 => s0
      case 1 => s1
      case _ => fib( n - 1, s0, s1 ) :: fib( n - 2, s0, s1 )
    }

    val t = fib(5, a(0), b(0))


//    t(n(0).toLong - 2L).toString
    ""
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = stdin.readLine

    val b = stdin.readLine

    val n = stdin.readLine.trim.toInt

    val result = fibonacciWords(a, b, n)

    printWriter.println(result)

    printWriter.close()
  }
}

