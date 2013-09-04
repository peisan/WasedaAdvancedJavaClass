package lesson.scala.basics.fizzbuzz

/**
 * Created with IntelliJ IDEA.
 * User: fujiokashigeki
 * Date: 2013/09/03
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
object FizzBuzz_Fujioka {
  def main(args:Array[String]) = {
    val i = 3 //args(0).toInt

    if(i % 15 == 0){
      System.out.println("FizzBuzz")
    }else{

    if(i % 5 == 0){
      println("Buzz")
    }

    if(i % 3 == 0){
      println("Fizz")
    }
   }
  }
 }
