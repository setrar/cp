package lesson7

/**
  * SCORE 100%
  *
  * Detected time complexity: O(N)
  *
  * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
  *
  * S is empty;
  * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
  * S has the form "VW" where V and W are properly nested strings.
  * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
  *
  * Write a function:
  *
  * object Solution { def solution(s: String): Int }
  *
  * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
  *
  * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
  *
  * Write an efficient algorithm for the following assumptions:
  *
  * N is an integer within the range [0..200,000];
  * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
  */
object Brackets {
  def solution(s: String): Int = {
    // write your code in Scala 2.12
    var xs = List[Char]()
    for (i <- s.indices) {
      s(i) match {
        case '{' | '[' | '(' => xs = s(i) :: xs
        case '}' =>
          if (xs.isEmpty) return 0
          if (xs.head == '{') xs = xs.tail

        case ']' =>
          if (xs.isEmpty) return 0
          if (xs.head == '[') xs = xs.tail

        case ')' =>
          if (xs.isEmpty) return 0
          if (xs.head == '(') xs = xs.tail

      }
    }
    if (xs.isEmpty) 1 else 0
  }
}
