object ex10 extends App {
  class Employee {
    var nameVar: String = "John Q. Public"
    var salary: Double = 0.0
    def this(n: String, s: Double) {
      this()
      nameVar = n
      salary = s
    }
    def name = nameVar
  }
}
