object ex5 extends App {
  def avg(array: Array[Double]) = {
    array.sum / array.length
  }
  val a = Array(0.0, 2, 3, 5, 6, 8)
  println(avg(a))
}
