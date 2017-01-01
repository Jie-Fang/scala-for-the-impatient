object ex4 extends App {
  class Money(d: Int, c: Int) {
    private val dollar = d + c / 100
    private val cent = c % 100
    override def toString = "$" + dollar + "." + cent
    def +(other: Money) = new Money(dollar + other.dollar, cent + other.cent)
    def -(other: Money) =
      if (this > other)
        new Money(dollar - other.dollar, cent - other.cent)
      else
        new Money(dollar - other.dollar, other.cent - cent)
    def <(other: Money) = dollar * 100 + cent < other.dollar * 100 + other.cent
    def >(other: Money) = dollar * 100 + cent > other.dollar * 100 + other.cent
    def ==(other: Money) = !(this < other) && !(this > other)
  }
  object Money {
    def apply(d: Int, c: Int): Money = new Money(d, c)
  }

  val m1 = Money(1,20)
  val m2 = Money(2,50)
  val m3 = Money(2,50)
  println(m1 + m2)
  println(m1 - m2)
  println(m2 - m1)
  println(m1 < m2)
  println(m1 > m2)
  println(m2 == m3)
}
