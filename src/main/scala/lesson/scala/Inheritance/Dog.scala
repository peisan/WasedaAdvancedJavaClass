package lesson.scala.inheritance

class Dog(name:String) extends Animal(name, "Dog"){
  def bark() = println("Wan!")
}
