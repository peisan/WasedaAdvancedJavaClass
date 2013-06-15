package lesson.scala.basics

object Loop {
  def main(args: Array[String]) = {
    val intArray = (1 to 10).toArray

    //for
    for(i <- 0 until intArray.size) println(intArray(i))

    //foreach
    for(i <- intArray) println(i)
    intArray.foreach(x => println(x))
    intArray.foreach(println(_))
  }
}
