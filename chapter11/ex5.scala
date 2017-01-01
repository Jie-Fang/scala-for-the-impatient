import scala.collection.mutable.ArrayBuffer

object scratch extends App {
  class Table() {
    private val content = new ArrayBuffer[String]

    def |(str: String) = {
      content += "<td>%s</td>".format(str)
      this
    }

    def ||(str:String) = {
      content += "</tr><tr>\n<td>%s</td>".format(str)
      this
    }
    override def toString = "<table><tr>\n%s</tr></table>".format(content.mkString)
  }
  object Table {
    def apply() = new Table()
  }

  val text = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" || "JVM, .NET"
  println(text)
}

