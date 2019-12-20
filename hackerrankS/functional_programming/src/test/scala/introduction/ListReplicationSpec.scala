package introduction

import org.scalatest._

class ListReplicationSpec extends FlatSpec with Matchers {
  "The ListReplicationSpec" should "not fail" in {
    ListReplication.f(3, List(1, 2, 3, 4)) shouldEqual List(1,1,1,2,2,2,3,3,3,4,4,4)
  }
}
