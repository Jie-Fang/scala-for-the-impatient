object ex8 extends App {
  class Car(private val maker: String, private val name: String,
           private val year: Int = -1, private var number: String = "") {
    override def toString: String = "Car: " + maker + " " + name + " " + year + " " + number
  }
  val a = new Car("abc", "xxx")
  val b = new Car("abc", "xxx", 1234)
  val c = new Car("abc", "xxx", number = "bs9823")
  val d = new Car("abc", "xxx", 1234, "bs9823")
  println(a)
  println(b)
  println(c)
  println(d)
}

