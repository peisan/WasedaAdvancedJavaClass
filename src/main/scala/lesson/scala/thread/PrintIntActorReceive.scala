package lesson.scala.thread

import scala.actors.Actor

class PrintIntActorReceive extends Actor {
  def act(): Unit = {
    //loop {  // continue receive without restart
    val number: String = receive {
      case i: Int => i.toString
      case _ => "Not Supported Type"
    }
    println("num " + number)
    //}
  }
}

object PrintIntActorReceive {
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
