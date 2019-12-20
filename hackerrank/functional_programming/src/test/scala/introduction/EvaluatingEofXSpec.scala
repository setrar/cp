package introduction

import org.scalatest._

class EvaluatingEofXSpec extends FlatSpec with Matchers {
  "The EvaluatingEofXSpec" should "should not fail" in {
    EvaluatingEofX.evaluatingEofX(2,Array(0.0000, 1.0000)) shouldEqual Array(1.0, 2.7183)
  }
}
