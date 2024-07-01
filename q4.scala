object q4 {
  private def sumEven(numbers: List[Int]) : Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val input : List[Int] = List(32, 1, 53, 64, 75)
    println(sumEven(input))
  }
}
