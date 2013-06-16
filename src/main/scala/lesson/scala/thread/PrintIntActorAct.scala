package lesson.scala.thread

import scala.actors.Actor

class PrintIntActorAct(i:Int) extends Actor {
  def act(): Unit = {
    println("Thread " + i)
  }
}

object PrintIntActorAct{
  def main(args: Array[String]): Unit = {
    println("main thread start")

    val list = (1 to 10) map {
      i => {
        println("creating Actor: " + i)
        new PrintIntActorAct(i)
      }
    }

    list.foreach(_.start())
    println("main thread end")
  }
}

