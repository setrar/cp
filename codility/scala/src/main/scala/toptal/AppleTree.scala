package toptal

class AppleTree {

  def getMaxContiguosFromArray(a: Array[Int], numberOrElements: Int): Array[Int] = {
    var sumForFirst = 0
    var sumForFirstPrev = 0
    var startingIndexForK = 0
    val maxAndStartingIndex = Array.ofDim[Int](2)
    var i = 0
    while ( i < a.length) {
      if (i <= a.length - numberOrElements) {
        var j = i
        while ( j < i + numberOrElements) {
          sumForFirst += a(j)
            j += 1
            j - 1
        }
      }
      if (sumForFirst > sumForFirstPrev) {
        sumForFirstPrev = sumForFirst
        startingIndexForK = i
      }
      sumForFirst = 0
      i += 1
      i - 1
    }
    maxAndStartingIndex(0) = sumForFirstPrev
    maxAndStartingIndex(1) = startingIndexForK
    maxAndStartingIndex
  }

  def solution(a: Array[Int], k: Int, l: Int): Int = {

    var totalOfKAndL = 0

    var maxAndStartingIndex = getMaxContiguosFromArray(a, k)
    totalOfKAndL += maxAndStartingIndex(0)
    val leadingElements = a.slice(0, maxAndStartingIndex(1))
    val trailingElements = a.slice(maxAndStartingIndex(1) + k, a.length)

    val mergedLeadingAndTrailingElements = leadingElements ++ trailingElements
    val mergedLeadingAndTrailingElementsArray = mergedLeadingAndTrailingElements

    maxAndStartingIndex = getMaxContiguosFromArray(mergedLeadingAndTrailingElementsArray, l)
    totalOfKAndL += maxAndStartingIndex(0)

    if (k > l) totalOfKAndL else -1
  }

}
