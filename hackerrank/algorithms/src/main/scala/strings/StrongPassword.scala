package strings

object StrongPassword {

  /**
    * https://alvinalexander.com/scala/how-to-use-scala-match-expression-like-switch-case-statement
    *
    * How to use a Scala match expression like a switch statement
    *
    */
  def minimumNumber(n: Int, password: String): Int = {
    val minPasswordLength: Int = 6
    val special_characters: List[Char] = "!@#$%^&*()-+".toList

    /**
      * State capturing the criteria
      */
    case class Criteria(digit: Boolean = false
                        , lower: Boolean = false
                        , upper: Boolean = false
                        , special: Boolean = false)

    /**
      * Surveying the password and populating the Criteria State
      */
      val survey = password.foldLeft(Criteria()) {
      (acc, x) =>
        (x: @annotation.switch) match {
          case _ if x.isLetter && x.isUpper => acc.copy(upper = true)
          case _ if x.isLetter && x.isLower => acc.copy(lower = true)
          case _ if x.isDigit => acc.copy(digit = true)
          case s if special_characters.contains(s) => acc.copy(special = true)
          case _ => acc
        }
    }

    /**
      * Dealing with the length rule
      */
    Math.max(
        minPasswordLength - n
      , survey.productArity - survey.productIterator.toList.count(_ == true)
    )
  }

}