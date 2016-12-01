object ex9 extends App {
  def lteqgt(values: Array[Int], v: Int) = {
    var lt = 0
    var eq = 0
    var gt = 0
    values.foreach(
      value =>
        if (value < v) lt += 1
        else if (value == v) eq += 1
        else gt += 1
    )
    (lt, eq, gt)
  }

  val a = Array(1, 2, 3, 4, 5)
  println(lteqgt(a, 3))
}

/*
object ex9 extends App {
  def lteqgt(values: Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

  val a = Array(1, 2, 3, 4, 5)
  println(lteqgt(a, 3))
}
*/
