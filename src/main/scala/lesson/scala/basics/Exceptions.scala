package lesson.scala.basics

object Exceptions {
  def main(args: Array[String]) = {
    try{
      //throw new IndexOutOfBoundsException("Sample Exception")
      //throw new NullPointerException("Sample Exception")
      //throw new Exception("Sample Exception")
    }catch{
      case e: IndexOutOfBoundsException => println(e.toString)
      case e: NullPointerException => println(e.toString)
      case e: Exception => println(e.toString)
    }finally{
      println("done");
    }
  }
}
