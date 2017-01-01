object ex8 extends App {
  class Matrix(val row: Int, val col: Int) {
    private val matrix = Array.ofDim[Double](row, col)

    def apply(r: Int, c: Int) = matrix(r)(c)
    def update(r: Int, c: Int, v: Double) = matrix(r)(c) = v

    def +(other: Matrix) = {
      val result = new Matrix(row, col)
      for (i <- 0 until row; j <- 0 until col)
        result(i, j) = matrix(i)(j) + other.matrix(i)(j)
      result
    }

    def *(other: Double) = {
      var result = new Matrix(row, col)
      for (i <- 0 until row; j <- 0 until col)
        result(i, j) = matrix(i)(j) * other
      result
    }

    private def prod(other: Matrix, i: Int, j: Int) = {
      (for (k <- 0 until col) yield matrix(i)(k) * other.matrix(k)(j)).sum
    }

    def *(other: Matrix) = {
      var result = new Matrix(row, other.col)
      for (i <- 0 until row; j <- 0 until other.col)
        result(i, j) = prod(other, i, j)
      result
    }

    override def toString: String = matrix.map(_.mkString(" ")).mkString("\n")
  }

  object Matrix {
    def apply(row: Int, col: Int): Matrix = new Matrix(row, col)

  }

  val x = Matrix(2,2)
  x(0, 0) = 1
  x(0, 1) = 2
  x(1, 0) = 3
  x(1, 1) = 4

  val y = Matrix(2, 3)
  y(0, 0) = 1
  y(0, 1) = 2
  y(0, 2) = 3
  y(1, 0) = 4
  y(1, 1) = 5
  y(1, 2) = 6

  println(x + x)
  println(y + y)
  println(x * 2)
  println(x * y)
}
