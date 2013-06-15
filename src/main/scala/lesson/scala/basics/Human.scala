package lesson.scala.basics

class Human(firstName: String, lastName: String, var age: Int) {
  def getName() = firstName + " " + lastName
}

object Human{
  def main(args: Array[String]) = {
    val firstName = args(0)
    val lastName = args(1)
    val age = args(2).toInt
    val me = new Human(firstName, lastName, age)
    println("My name is " + me.getName()
      + " I am " + me.age + " years old");
  }
}
