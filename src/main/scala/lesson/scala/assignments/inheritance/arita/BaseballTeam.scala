package lesson.scala.assignments.inheritance.arita


class BaseballTeam {
  val name = "No Name"
  val ranking : Int = 0
  val mascot : String = "nothing"

  def say() : String = "we are " + name + " our ranking is " + ranking.toString
  def mascotPerformance() : String = "i am " + mascot + ". do nothing"
}

object BaseballTeam {
  def main(args : Array[String]) : Unit = {
    val baseballTeam = new BaseballTeam
    println(baseballTeam.say())
    println(baseballTeam.mascotPerformance)
  }
}