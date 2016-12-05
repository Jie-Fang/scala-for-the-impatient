object ex4 extends App {
  class Point(val x: Double, val y: Double) { }
  object Point {
    def apply(x: Double, y: Double): Point =
      new Point(x, y)
  }

  val p = Point(2, 3)
  println(p.x)
  println(p.y)
}
