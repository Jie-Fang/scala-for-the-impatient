import scala.collection.mutable.ArrayBuffer
object ex6 extends App {
  val a = Array(1, 2, 3, 4, 5)
  val b = a.toBuffer
  val c = a.sortWith(_ > _)
  val d = b.sorted.reverse //ArrayBuffer has reverse method
  println(c.mkString(","))
  println(d.mkString(","))
}
