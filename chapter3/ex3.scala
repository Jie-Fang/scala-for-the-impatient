object ex3 extends App {
  def change(array: Array[Int]) = {
    for (i <- array.indices) yield {
      if (i % 2 == 0) {
        if (i < array.length - 1) array(i + 1) else array(i)
      }
      else
        array(i - 1)
    }
  }
  val a = Array(1, 2, 3, 4, 5)
  val b = Array(1, 2, 3, 4, 5, 6)
  println(change(a).mkString(","))
  println(change(b).mkString(","))
}
