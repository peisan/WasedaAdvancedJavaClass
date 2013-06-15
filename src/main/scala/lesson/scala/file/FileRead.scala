package lesson.scala.file

import scala.io.Source

object FileRead {
  def main(args: Array[String]) = {
    val source = Source.fromFile("data/in.txt")
    for(line <- source.getLines){
      println(line)
    }
    source.close()
  }
}
