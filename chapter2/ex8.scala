object ex8 extends App {
  def product(s : String) = {
    s.foldLeft(1L)(_ * _)
  }
  println(product("Hello"))
}
