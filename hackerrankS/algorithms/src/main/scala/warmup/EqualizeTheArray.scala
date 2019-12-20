package warmup

import scala.language.postfixOps

object EqualizeTheArray {

  def equalizeArray(arr: Array[Int]): Int = {

    val (x,_) = arr.groupBy(identity).maxBy{ case (_,y) => y.length }
    arr.filterNot(x==).length

  }

}
