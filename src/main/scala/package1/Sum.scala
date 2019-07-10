package package1

class Sum {

  def product(n: Int, temp: Int): Int= {
    if (n == 1)
      temp
    else
      product(n - 1, n * temp)
  }

  def sum(temp1: Int, m: Int): Int = {
      if (temp1 == 0)
        m
      else
        sum(temp1 / 10, (temp1%10)+m )
    }

}
