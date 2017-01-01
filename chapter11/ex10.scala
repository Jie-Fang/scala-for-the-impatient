object scratch extends App {
  object RichFile {
    def unapplySeq(arg: String): Option[Seq[String]] = {
      if (arg.trim == "") None
      else {
        val tokens = arg.trim.split("/")
        if (tokens(0) == "")
          Some(tokens.drop(1))
        else
          Some(tokens)
      }
    }
  }

  val RichFile(first, middle, last) = "/home/cay/readme.txt"
  println(first + " " + middle + " " + last)
}
