object ex9 extends App {
  class RichFile(val filePath: String) {

  }
  object RichFile {
    def apply(filePath: String): RichFile = new RichFile(filePath)
    def unapply(arg: RichFile) = {
      val idx = arg.filePath.lastIndexOf('/')
      val path = arg.filePath.substring(0, idx)
      val file = arg.filePath.substring(idx+1)
      Some((path, file))
    }
  }

  val RichFile(path, name) = RichFile("/home/cay/readme.txt")
  println(path + " " + name)
}

