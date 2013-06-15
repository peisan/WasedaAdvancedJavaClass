package lesson.scala.basics

object Functions {
  def main(args: Array[String]) = {
    sayHello()
    say(gao())
  }

  def sayHello() = println("Hello")
  //def say = {word:String => println(word)}
  def say(word:String): Unit = {
    println(word)
  }
  def gao(): String = "gao"
}
