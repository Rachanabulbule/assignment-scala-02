package package1
import package1._

object Main extends App{

  val max = new Maximum()
  println(max.findMax(List(2,3,1,5)))



 val f = new Fab
  println(f.fab(6))


  val s = new Sum
  //println(s.product(5,1))
  //println(s.sum(120, 0))
   println(s.sum(s.product(4,1), 0))

  val obj = new Interpolation()
  println(obj.interpolation(List(10,20,30,40)))

}
