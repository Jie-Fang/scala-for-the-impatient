object ex7 extends App {
  class Square(val x1: Int, val y1: Int, val w: Int)
    extends java.awt.Rectangle(x1, y1, w, w) {
    def this() = this(0, 0, 0)
    def this(w: Int) = this(0, 0, w)
  }
}
