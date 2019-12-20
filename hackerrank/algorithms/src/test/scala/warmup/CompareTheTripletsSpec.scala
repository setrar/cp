package warmup

import org.scalatest._

class CompareTheTripletsSpec extends FlatSpec with Matchers {
  "The CompareTheTripletsSpec" should "not fail" in {
    CompareTheTriplets.compareTriplets(Array(5,6,7),Array(3,6,10)) shouldEqual Array(1,1)
    CompareTheTriplets.compareTriplets(Array(17,28,30),Array(99,16,8)) shouldEqual Array(2,1)
  }
}
