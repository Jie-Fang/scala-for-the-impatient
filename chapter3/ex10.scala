import scala.collection.JavaConverters.asScalaBufferConverter
import java.awt.datatransfer._
import scala.collection.mutable.Buffer
object ex10 extends App {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val buffer: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor).asScala
  println(buffer.getClass)
}
