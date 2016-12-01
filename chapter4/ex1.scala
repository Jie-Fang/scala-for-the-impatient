object ex4 extends App {
  val a = Map("x" -> 1.0, "y" -> 2.0, "z" -> 3.0)
  val b = for ((k, v) <- a) yield (k, v * 0.9)
  println(b)
}
