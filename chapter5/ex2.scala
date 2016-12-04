object ex2 extends App {
  class BankAccount {
    private var account = 0.0
    def deposit(v: Double) { account += v }
    def withdraw(v: Double) {
      if (account >= v)
        account -= v
      else
        println("The account has not enough money to withdraw")
    }
    def balance = account
  }

  val a = new BankAccount
  a.deposit(1923)
  println(a.balance)
  a.withdraw(100)
  println(a.balance)
  a.withdraw(10000)

}
