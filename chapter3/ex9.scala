import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConverters.asScalaBuffer
object ex9 extends App {
  val a = java.util.TimeZone.getAvailableIDs
  val b = a.filter(_.startsWith("America/")).map(_.drop(8))
  println(b.mkString(","))
}
