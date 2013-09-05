package lesson.scala.assignments.inheritance.arita

class Dragons extends BaseballTeam{
  override val name:String = "Dragons"
  override val mascot:String = "Doara"
  override def mascotPerformance() : String = "I am " + mascot + ". I broke my hand :("
}

object Dragons{
  def main(args : Array[String]) : Unit = {
    val baseballTeam = new Dragons
    println(baseballTeam.say())
    println(baseballTeam.mascotPerformance)
  }
}
