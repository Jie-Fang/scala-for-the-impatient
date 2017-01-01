object ex8 extends App {
  val a = Array("Hello", "World", "Bye")
  val b = Array(5, 5, 3)
  val c = Array(4, 5, 6)

  println(a.corresponds(b)(_.length == _))
  println(a.corresponds(c)(_.length == _))
}
