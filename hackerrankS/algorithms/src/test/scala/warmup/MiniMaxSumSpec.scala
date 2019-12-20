package warmup

import org.scalatest._

class MiniMaxSumSpec extends FlatSpec with Matchers {
  "The MiniMaxSumSpec" should "not fail" in {
    MiniMaxSum.miniMaxSum(Array(1,2,3,4,5)) shouldEqual Array(10,14)
    MiniMaxSum.miniMaxSum(Array(7,69,2,221,8974)) shouldEqual Array(299,9271)
    MiniMaxSum.miniMaxSum1(Array(1,2,3,4,5)) shouldEqual Array(10,14)
    MiniMaxSum.miniMaxSum1(Array(7,69,2,221,8974)) shouldEqual Array(299,9271)
    MiniMaxSum.miniMaxSum2(Array(1,2,3,4,5)) shouldEqual Array(10,14)
    MiniMaxSum.miniMaxSum2(Array(7,69,2,221,8974)) shouldEqual Array(299,9271)
  }
}
