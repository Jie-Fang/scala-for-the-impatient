object ex2 extends App {
  def change(arr: Array[Int]): Unit = {
    val size = arr.length
    for (i <- 0 until (size-1, 2)) {
        val tmp = arr(i + 1)
        arr(i + 1) = arr(i)
        arr(i) = tmp
    }
    println(arr.mkString(","))
  }
  val a = Array(1, 2, 3, 4, 5)
  val b = Array(1, 2, 3, 4, 5, 6)
  change(a)
  change(b)
}
