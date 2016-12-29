package object random {
  var seed: Int = 0
  def setSeed(value: Int) { seed = value }
  def nextInt(): Int = {
    seed = (seed * 1664525 + 1013904223) % (2 ^ 32)
    seed
  }
  def nextDouble(): Double = nextInt().toDouble / Int.MaxValue.toDouble

}

import random._

object ex3 extends App {
  setSeed(5)
  println(nextInt())
  println(nextDouble())
}
