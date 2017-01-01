object ex4 extends App {
  def f(n: Int) = (1 to n).foldLeft(1)((x, y) => x * y)
  for (i <- 0 to 9)
    println(f(i))
}
