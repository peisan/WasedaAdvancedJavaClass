package lesson.scala.InheritanceTraining

class Baseball{
  val name = "No one"
  val ranking : Int = 0
  val acePitcher :String = "nothing"

  def say(): String = "We are " + name + " our ranking is " + ranking.toString
  def acePitcherPerformance : String = "i am " + acePitcher + ". do nothing "
}

object Baseball{
  def main(args: Array[String]) : Unit = {
    val baseballTeam = new Baseball
    println(baseballTeam.say())
    println(baseballTeam.acePitcher)
  }
}

