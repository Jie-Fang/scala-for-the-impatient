object ex1 extends App {
  class Counter {
    private var value = 0
    def increment() {
      if (value == Int.MaxValue)
        value = 0
      else
        value += 1
    }
    def current() = value
  }
  val a = new Counter
  while (a.current != Int.MaxValue)
    a.increment
  println(a.current)
  a.increment
  println(a.current)
}
