import scala.collection.JavaConverters.propertiesAsScalaMapConverter

object ex7 extends App {
  val props: scala.collection.Map[String, String] = System.getProperties.asScala
  val maxLen = props.keySet.maxBy(item => item.length).length
  props.foreach(item => printf("%-" + maxLen + "s | %s\n", item._1, item._2))
}
