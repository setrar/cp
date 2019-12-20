package warmup

import org.scalatest._

class EqualizeTheArraySpec extends FlatSpec with Matchers {
  "The EqualizeTheArraySpec" should "not fail" in {
    EqualizeTheArray.equalizeArray(Array(3,3,2,1,3)) shouldEqual 2
  }
}
