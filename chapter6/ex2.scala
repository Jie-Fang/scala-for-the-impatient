object ex2 extends App {
  class UnitConversion(val factor: Double) {
    def conversion(x: Double): Double = x * factor
  }
  object InchesToCentimeters extends UnitConversion(2.54)
  object GallonsToLiters extends UnitConversion(3.78541178)
  object MilesToKilometers extends UnitConversion(1.609344)

  println(InchesToCentimeters.conversion(1))
  println(GallonsToLiters.conversion(1))
  println(MilesToKilometers.conversion(1))
}
