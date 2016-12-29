object ex2 extends App {
  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance}
    override def toString: String = "current balance is " + balance
  }
  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = super.deposit(amount - 1)
    override def withdraw(amount: Double) = super.withdraw(amount + 1)
  }

  val a = new BankAccount(100)
  val b = new CheckingAccount(100)
  a.deposit(10)
  println(a)
  a.withdraw(20)
  println(a)

  b.deposit(10)
  println(b)
  b.withdraw(20)
  println(b)
}
