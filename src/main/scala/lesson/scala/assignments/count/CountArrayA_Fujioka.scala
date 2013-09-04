package lesson.scala.assignments.count

object CountArrayA_Fujioka {
  def main(args: Array[String]) = {
    println(count((1 to 100).toArray))
  }

  def count(array:Array[Int])={
    array.size
  }
}
