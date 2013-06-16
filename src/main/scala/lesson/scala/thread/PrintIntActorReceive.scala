package lesson.scala.thread

import scala.actors.Actor

class PrintIntActorReceive extends Actor {
  def act(): Unit = {
    loop {
      receive {
        case i: Int => println(i)
        case _ => println("Not Supported Type")
      }
    }
  }
}

object PrintIntActorReceive{
  def main(args: Array[String]): Unit = {
    println("main thread start")
    (1 to 10).foreach(
      i => {
        println("creating Actor: " + i)
        new PrintIntActorReceive().start() ! i
      }
    )
    println("main thread end")
  }
}
