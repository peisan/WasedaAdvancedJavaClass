package lesson.scala.file

import java.io.PrintWriter

object FileWrite {
  def main(args: Array[String]) = {
    val lines = List("scala", "a", "b", "c", "d", "e")
    val writer = new PrintWriter("data/scala_out.txt")
    for(line <- lines){
      writer.println(line)
    }
    writer.close()
  }
}
