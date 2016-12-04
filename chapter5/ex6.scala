object ex6 extends App {
  class Person(var age: Int = 0) {
    if (age < 0) age = 0
  }
  val p1 = new Person(12)
  println(p1.age)
  val p2 = new Person(-12)
  println(p2.age)
}
