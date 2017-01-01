object ex7 extends App {

  def adjustToPair(fun: (Int, Int) => Int) = (x: (Int, Int)) => fun(x._1, x._2)

  val pairs = (1 to 10) zip (11 to 20)
  println(pairs.map(adjustToPair(_ + _)))

}
