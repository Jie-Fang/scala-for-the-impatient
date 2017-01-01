object ex10 extends App {
  def unless(condition: => Boolean)(block: => Unit) = {
    if (!condition)
      block
  }

  val a = (1 to 10).map(_ * 2)
  a.foreach(x => unless(x > 13){ println(x) })
}
