package package1

class Fab {

  def fab(n: Int): Int ={
    def calfab(n: Int, pre: Int, curr: Int): Int={
      if(n==0)
        pre
      else
        calfab(n-1,curr,curr+pre)

    }
    calfab(n,0,1)
  }

}
