package lesson.scala.thread

import scala.actors.Actor

class PrintIntActorReact extends Actor{
  def act(): Unit = {
    loop {  // continue receive without restart
      react {
        case i: Int => reply("reply" + i.toString)
        case _ => reply("Not Supported Type")
      }
    }
  }
}

object PrintIntActorReact{
  def main(args: Array[String]): Unit = {
    println("main thread start")
    (1 to 10).foreach(
      i => {
        println("creating Actor: " + i)
        println(new PrintIntActorReact().start() !? i)
      }
    )
    println("main thread end")
  }
}
