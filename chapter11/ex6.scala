object ex6 extends App {
  class ASCIIArt(val context: String) {
    def +(other: ASCIIArt) = {
      context.split("\n").zip(other.context.split("\n")).map(x => x._1 + x._2).mkString("\n")
    }
    def ^(other: ASCIIArt) = {
      context + "\n" + other.context
    }
    override def toString = context
  }

  val x = new ASCIIArt(
  """ /\_/\
  ( ' ' )
  (  -  )
   | | |
  (__|__)""")

  val y = new ASCIIArt(
  """   -----
   / Hello \
  <  Scala |
   \ Coder /
     -----""")

  println(x + y)
  println(x ^ y)
}
