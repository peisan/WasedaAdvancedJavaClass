package lesson.scala.basics

object CountArrayA {
  def main(args: Array[String]) = {
    println(count((1 to 100).toArray))
  }

  def count(array:Array[Int])={
    array.size
  }
}
