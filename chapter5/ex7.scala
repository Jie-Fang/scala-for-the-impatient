object ex7 extends App {

  class Person(private val name: String = "") {
    def firstName = name.split(" ")(1)

    def lastName = name.split(" ")(2)
  }

}
