object ex9 extends App {
  def product(s: String): Long = {
    val tail = s.tail  
    s.head * (if (tail.length == 0) 1 else product(tail))
  }
  product("Hello")
}
