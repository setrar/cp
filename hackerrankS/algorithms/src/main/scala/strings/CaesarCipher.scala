package strings

import scala.collection.immutable.ListMap

object CaesarCipher {

  def caesarCipher(s: String, k: Int): String = {
    /**
      * Alphabet Lists
      */
    // Original
    val OAList: List[Char] = "abcdefghijklmnopqrstuvwxyz".toList
    // Rotated by k
    val RAList: List[Char] = (0 until k).foldLeft(OAList){ (acc, _) =>
      acc.tail.take(acc.length - 1).:+(acc.head)
    }
    /**
      * Create a Sorted Map with Original Alphabet and its respective indices
      */
    val OASortedMap: ListMap[Char,Int] = ListMap(OAList.zipWithIndex: _*)
    /**
      * Cypher the message
     */
    s.toList.foldLeft(""){ (acc, x) =>
      OASortedMap.get(x.toLower) match  {
        case Some(i) => acc + {
          val l = RAList(i)
          if (x.isLower) l else l.toUpper
        }
        case None => acc + x
      }
    }
  }

}
