object ex2 extends App {
  val a = Array(1, 4, 6, 3, 9, 5)
  val b = a.reduceLeft((x, y) => math.max(x, y))
  println(b)
}
