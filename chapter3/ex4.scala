object ex4 extends App {
  def change(array: Array[Int]) = {
    array.filter(_ > 0) ++ array.filter(_ <= 0)
  }
  val a = Array(0, 2, -3, 5, -6, -8)
  println(change(a).mkString(","))
}
