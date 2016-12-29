import java.lang.System._

object ex9 extends App {
  val username = getProperty("user.name")
  val passwd = io.StdIn.readLine("password:")
  if (passwd != "secret")
    err.println("wrong password!")
  else
    println("Welcome %s".format(username))
}
