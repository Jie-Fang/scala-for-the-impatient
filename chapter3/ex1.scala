import scala.util.Random

object ex1 extends App {
  val n = 10
  val a = new Array[Int](10)
  for (i <- 0 until n)
    a(i) = Random.nextInt(n)
  println(a.mkString(","))
}
