import scala.io.Source
import scala.collection.JavaConverters.mapAsScalaMapConverter

object ex5 extends App {
  val tokens = Source.fromFile("/home/jie/Desktop/myfile.txt").mkString.split("\\s+")
  val result: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int].asScala
  tokens.foreach(token => {
    result(token) = result.getOrElse(token, 0) + 1
  })
  println(result)
}
