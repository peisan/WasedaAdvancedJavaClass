package lesson.scala.basics

object CountArrayB{
  def main(args: Array[String]) = {

  var x = 0
  var y = 0

  for(i <- 1 until count((1 to 100).toArray)){

    if(i % 5 == 0){
      println(i)
      x = x + 1
    }else if(i % 3 == 0){
      println(i)
      y = y + 1
    }
  }
  println("5の倍数"+x)
  println("3の倍数"+y)

  def count(array:Array[Int])={
    array.size
  }
 }
}