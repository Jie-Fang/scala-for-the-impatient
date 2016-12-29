object ex6 extends App {
  class Point(val x: Double, val y: Double) {
    override def toString: String = "(%f, %f)".format(x, y)
  }
  abstract class Shape {
    def centerPoint: Point
    override def toString: String = "The center is " + centerPoint
  }
  class Rectangle(val topLeft: Point, val bottemRight: Point) extends Shape {
    override def centerPoint = new Point((topLeft.x + bottemRight.x) / 2, (topLeft.y + bottemRight.y) / 2)
  }
  class Circle(override val centerPoint: Point, val radial: Double) extends Shape

  val l = new Point(1, 2)
  val r = new Point(3, 4)
  val a = new Rectangle(l, r)
  println(a)
  val c = new Point(1, 1)
  val b = new Circle(c, 2.0)
  println(b)
}

