object ex8 extends App {
  val a = Array(2, 1, -1, 3, 4, 4, -5, 3, -1, 4, -6, -8, 9, -9).toBuffer
  val b = for (i <- 0 until a.length if a(i) < 0) yield i
  val c = b.reverse.dropRight(1)
  for (i <- c)
    a.remove(i)

  //(for (i <- 0 until a.length if a(i) < 0) yield i).reverse.dropRight(1).foreach(a.remove(_))
  println(a.mkString(","))
}
