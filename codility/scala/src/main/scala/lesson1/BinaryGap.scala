package lesson1

import scala.collection.JavaConverters._

// you can write to stdout for debugging pu
// println("this is a debug message")
object BinaryGap {
  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    val as = n.toBinaryString
    val t =  as
      .dropRight(as.length - as.lastIndexOf('1'))
      .split('1')
      .toList
    t match {
      case Nil => 0
      case _ => t.max.length
    }
  }
}