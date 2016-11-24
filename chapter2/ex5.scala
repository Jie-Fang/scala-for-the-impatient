object ex5 extends App {
  def countdown(n : Int) {
    for (i <- (0 to n).reverse) println(i)
  }
  countdown(5)
}
