object ex4 extends App {
  class Time(private var hrs: Int = 0, private var min: Int = 0) {
    private var mins = hrs * 60 + min
    def hours = mins / 60
    def minutes = mins % 60
    def before(other: Time): Boolean = other.mins > mins

  }
  val t1 = new Time(2, 38)
  val t2 = new Time(4, 29)
  println(t1.hours)
  println(t1.minutes)
  if (t1.before(t2))
    println("t1 is before t2")
}
