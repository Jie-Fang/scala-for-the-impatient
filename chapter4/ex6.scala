import java.util.Calendar._

object ex6 extends App {
  val days = scala.collection.mutable.LinkedHashMap(
    "Monday" -> MONDAY,
    "Tuesday" -> TUESDAY,
    "Wednesday" -> WEDNESDAY,
    "Thursday" -> THURSDAY,
    "Friday" -> FRIDAY,
    "Saturday" -> SATURDAY,
    "Sunday" -> SUNDAY
  )
  println(days)
}
