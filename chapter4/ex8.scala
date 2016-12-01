object ex8 extends App {
  def minmax(values: Array[Int]) = {
    val minValue = values.min
    val maxValue = values.max
    (minValue, maxValue)
  }

  val a = Array(1, 2, 3, 4, 5)
  println(minmax(a))
}
