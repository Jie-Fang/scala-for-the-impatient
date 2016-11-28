object ex7 extends App {
  val a = Array(2, 1, 1, 3, 4, 4, 5, 3, 1, 4, 6, 8, 9, 9)
  val b = a.distinct
  println(b.mkString(","))
}
