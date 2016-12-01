import scala.collection.immutable
import scala.io.Source

object ex3 extends App {
  val tokens = Source.fromFile("/home/jie/Desktop/myfile.txt").mkString.split("\\s+")
  // 不能更新一个不可变的映射，但是可以获取一个新的映射，或者更新var变量
  var result = new immutable.HashMap[String, Int]
  tokens.foreach(token => {
    result = result + (token -> (result.getOrElse(token, 0) + 1))
  })
  println(result)
}
