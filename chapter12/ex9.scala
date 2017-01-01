object ex9.scala extends App {
  val a = Array("Hello", "World", "Bye")
  val b = Array(5, 5, 3)
  val c = Array(4, 5, 6)

  def myCorresponds[A, B](a: Seq[A], b: Seq[B], f: (A, B) => Boolean) = {
    (a zip b).map(x => f(x._1, x._2)).count(!_) == 0
  }

  println(myCorresponds(a, b, (x: String, y: Int) => x.length == y))
  println(myCorresponds(a, c, (x: String, y: Int) => x.length == y))
}
