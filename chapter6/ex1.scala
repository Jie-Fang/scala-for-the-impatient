object ex6 extends App {
  object Conversions {
    def inchesToCentimeters(x: Double): Double = x * 2.54

    def gallonsToListers(x: Double): Double = x * 3.78541178

    def milesToKilometers(x: Double): Double = x * 1.609344
  }
  println(Conversions.inchesToCentimeters(1))
  println(Conversions.gallonsToListers(1))
  println(Conversions.milesToKilometers(1))
}
