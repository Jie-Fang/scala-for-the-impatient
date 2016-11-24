object ex6 extends App {
  val str: String = "Hello"
  var product: Long = 1
  for (i <- str)
    product *= i
  println(product)
}
