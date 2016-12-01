import java.util.Scanner

object ex2 extends App {
  val a = new scala.collection.mutable.HashMap[String, Double]()
  val in = new Scanner(new java.io.File("/home/jie/Desktop/myfile.txt"))
  var count = 0
  while (in.hasNext) {
    count += 1
    val key = in.next
    if (a.contains(key))
      a(key) += 1
    else
      a(key) = 1
  }
  println(a)
}
/*
import scala.collection.mutable
import scala.io.Source

object ex2 extends App {
  val tokens = Source.fromFile("/home/jie/Desktop/myfile.txt").mkString.split("\\s+")
  val result = new mutable.HashMap[String, Double]()
  tokens.foreach(token => {
    if (result.contains(token)) result(token) += 1 else result(token) = 1
  })
  println(result)

}
*/
