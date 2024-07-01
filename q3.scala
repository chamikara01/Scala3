object q3 {
  private def avg(a : Int, b : Int) : Double = {
    val mean: Double = (a + b) / 2.0
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args : Array[String]) : Unit = {
    println(avg(5,10))
  }
}
