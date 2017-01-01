import scala.math.abs

object ex6 extends App {
  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
    override def toString = num + "/" + den
    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
    def +(other: Fraction) = new Fraction(num * other.den + den * other.num, den * other.den)
    def -(other: Fraction) = new Fraction(num * other.den - den * other.num, den * other.den)
    def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
    def /(other: Fraction) = new Fraction(num * other.den, den * other.num)
  }
  object Fraction {
    def apply(n: Int, d: Int): Fraction = new Fraction(n, d)
  }

  val f1 = Fraction(2, 3)
  val f2 = Fraction(3, 6)
  println(f1 + f2) // 2/3+1/2=7/6
  println(f1 - f2) // 2/3-1/2=1/6
  println(f2 - f1) // 1/2-2/3=-1/6
  println(f1 * f2) // 2/3*1/2=1/3
  println(f1 / f2) // 2/3*2=4/3
}
