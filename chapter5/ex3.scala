object ex3 extends App {
  class Time(private var hrs: Int = 0, private var min: Int = 0) {
    def hours = hrs
    def minutes = min
    def before(other: Time): Boolean = (other.hrs * 60 + other.min) > (hrs * 60 + min)

  }
  val t1 = new Time(2, 38)
  val t2 = new Time(4, 29)
  println(t1.hours)
  println(t1.minutes)
  if (t1.before(t2))
    println("t1 is before t2")
}
