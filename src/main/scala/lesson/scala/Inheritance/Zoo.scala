package lesson.scala.inheritance

object Zoo {
  def main(args: Array[String]) = {
    val messi = new Animal("messi")
    messi.say()

    val pochi = new Dog("pochi")
    pochi.bark()
    pochi.say()
  }
}