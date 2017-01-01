object ex1 extends App {
  def values(fun: (Int) => Int, low: Int, high: Int) = {
    for (i <- low to high) yield (i, fun(i))
    // (low to high) map { x => (x, fun(x)) }
  }

  val a = values(x => x * x, -5, 5)
  println(a)
}
