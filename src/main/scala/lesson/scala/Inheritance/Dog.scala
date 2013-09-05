package lesson.scala.inheritance

class Dog(name:String) extends Animal(name){
  override val kind:String = "Dog"
  def bark() = println("Wan!")
}
