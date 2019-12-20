package lesson12

object Gcd {

  def bySubtraction(a: Int, b: Int): Int =
    if (a == b)
      a
    else
      if (a > b)
      bySubtraction(a - b, b)
    else
      bySubtraction(a, b - a)

  def gcd(a: Int, b: Int): Int =
    if (a % b == 0)
      b
    else
      gcd(b, a % b)

  def byBinary(a: Int, b: Int, res: Int): Int =
    if (a == b)
      res * a
    else
      if (a % 2 == 0 && b % 2 == 0)
        byBinary(a / 2, b / 2, 2 * res)
      else
        if (a % 2 == 0)
          byBinary(a / 2, b, res)
        else
          if (b % 2 == 0)
            byBinary(a, b / 2, res)
          else
            if (a > b)
              byBinary(a, b / 2, res)
            else
              byBinary(a, b - a, res)
}
