package package1

class Maximum {

    def findMax(xs:List[Int]): Int = {
      val head = xs.head
      val tail = xs.tail
      if (xs.tail.isEmpty)
        xs.head
      else {
        val m = findMax(xs.tail)
        if (head >= m) head else m
      }
    }
}
