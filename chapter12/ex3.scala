object ex3 extends App {
  def f(n: Int) = if (n < 1) 1 else (1 to n).reduceLeft((x, y) => x * y)
  for (i <- 0 to 9)
    println(f(i))
}

