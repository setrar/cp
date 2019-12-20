package toptal

// https://enlightensoft.wordpress.com/2018/03/09/coding-problem-air-plan-seat-allocation/

import util.control.Breaks._

import scala.collection.mutable

object AirplaneSeatAllocation {

/*
  def solution(n: Int, s: String): Int = {
    var result = 0

    var allSeatMap = mutable.Map[Int, Array[Int]]()
    var splitted: Array[String] = null
    if (s.trim.length > 0) {
      splitted = s.split(" ")
      splitted.sorted
    }
    var rowCount: Int = 1
    while (rowCount <= n) {
      val row = Array.ofDim[Array[Int]](3)
      val c1 = Array.fill[Int](3)(0)
      val c2 = Array.fill[Int](4)(0)
        val c3 = Array.fill[Int](3)(0)
      row(0) = c1
      row(1) = c2
      row(3) = c3
      allSeatMap += (rowCount -> row)
      if (s.trim.length > 0) {
        var j = 0
        while (j < splitted.length) {
          val code = splitted(j)
          val subC = code.substring(1)
          val currRow = code.substring(0, 1).toInt
          if (currRow == rowCount) subC match {
            case "A" =>
              allSeatMap(rowCount)(0).set(0, 1)
              break //todo: break is not supported
            case "B" =>
              allSeatMap(rowCount) += ().set(1, 1)
              break //todo: break is not supported
            case "C" =>
              allSeatMap.get(rowCount).get(0).set(2, 1)
              break //todo: break is not supported
            case "D" =>
              allSeatMap.get(rowCount).get(1).set(0, 1)
              break //todo: break is not supported
            case "E" =>
              allSeatMap.get(rowCount).get(1).set(1, 1)
              break //todo: break is not supported
            case "F" =>
              allSeatMap.get(rowCount).get(1).set(2, 1)
              break //todo: break is not supported
            case "G" =>
              allSeatMap.get(rowCount).get(1).set(3, 1)
              break //todo: break is not supported
            case "H" =>
              allSeatMap.get(rowCount).get(2).set(0, 1)
              break //todo: break is not supported
            case "J" =>
              allSeatMap.get(rowCount).get(2).set(1, 1)
              break //todo: break is not supported
            case "K" =>
              allSeatMap.get(rowCount).get(2).set(2, 1)
              break //todo: break is not supported
          }

          {
            j += 1; j - 1
          }
        }
      }

      {
        rowCount += 1; rowCount - 1
      }
    }

    rowCount = 1
    while ( {
      rowCount <= N
    }) {
      if (!allSeatMap.get(rowCount).get(0).contains(1)) { // System.out.println(rowCount + "C1");
        result += 1
      }
      if (!allSeatMap.get(rowCount).get(1).contains(1)) { // System.out.println(rowCount + "C2");
        result += 1
      }
      else if ((allSeatMap.get(rowCount).get(1).get(1) eq 0) && (allSeatMap.get(rowCount).get(1).get(2) eq 0)) if ((allSeatMap.get(rowCount).get(1).get(0) eq 0) || (allSeatMap.get(rowCount).get(1).get(3) eq 0)) { // System.out.println(rowCount + "c2");
        result += 1
      }
      if (!allSeatMap.get(rowCount).get(2).contains(1)) { // System.out.println(rowCount + "C3");
        result += 1
      }

      {
        rowCount += 1; rowCount - 1
      }
    }
    return result
  }
  }
*/

}
