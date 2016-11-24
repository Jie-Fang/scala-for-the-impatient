// solution 1
object ex7 extends App {
  val str: String = "Hello"
  println(str.foldLeft(1L)(_ * _))
}

// solution 2
object ex7 extends App {
  val str: String = "Hello"
  println(str map (_.toLong) reduce (_ * _))
}

// solution 3
object ex7 extends App {
  val str: String = "Hello"
  println(str map.(_.toLong).product)
}
