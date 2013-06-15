package lesson.scala.basics

object Variables {
  def main(args: Array[String]) = {
    val str1 = "hi"
    var str2 : String = "he"
    str2 += "llo"
    val int1 : Int= 100
    var int2 = 200
    int2 += 100
    println(str1 + str2 + int1 + int2)
  }
}
