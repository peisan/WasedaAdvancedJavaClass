package lesson.scala.inheritance

class Animal(val name:String, val kind:String) {
  def say(): Unit = {
    println("Hi, My name is " + name)
    println("I am " + kind)
  }
}
