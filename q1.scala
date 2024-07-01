object q1 {
  private def reverse(str: String) : String = {
    if (str.isEmpty) ""
    else reverse(str.tail) + str.head
  }

  def main (args : Array[String]): Unit = {
    println(reverse("Chamikara"))
  }
}
