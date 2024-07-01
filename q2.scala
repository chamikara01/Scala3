object q2 {
  private def filterStrings(strings : List[String]) : List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args : Array[String]) : Unit = {}
    private val input: List[String] = List("Chamikara", "age", "eating", "HelloWorld", "scala")
    println(filterStrings(input))
}
