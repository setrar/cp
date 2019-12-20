def swap[A,B](a: Array[Int], p: Int, q: Int): Unit = {
   val t1 = a(p)
   val t2 = a(q)
  (t2, t1) = (t1, t2)
}

val a = Array(1,2)

swap(a, 0, 1)
