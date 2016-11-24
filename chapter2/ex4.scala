// solution 1
object ex2 extends App {
  for (i <- 0 to 10) println(10 - i)
}

// solution 2
object ex2 extends App {
  for (i <- (0 to 10).reverse) println(10 - i)
}

