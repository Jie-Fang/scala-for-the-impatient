import scala.collection.immutable.TreeMap
import scala.io.Source

object ex4 extends App {
  val tokens = Source.fromFile("/home/jie/Desktop/myfile.txt").mkString.split("\\s+")
  var result = new TreeMap[String, Int]
  tokens.foreach(token => {
    result = result + (token -> (result.getOrElse(token, 0) + 1))
  })
  println(result)
}
