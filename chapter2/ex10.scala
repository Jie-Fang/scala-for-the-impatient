object ex10 extends App {
  def foo(x: Double, n: Int): Double = {
    if (n < 0) 1 / foo(x, -n)
    else if (n == 0) 1
    else if (n % 2 == 0) math.pow(foo(x, n / 2), 2)
    else x * foo(x, n - 1)
  }
  println(foo(2, 4))
}
