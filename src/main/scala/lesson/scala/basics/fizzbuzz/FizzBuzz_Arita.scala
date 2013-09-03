package lesson.scala.basics.fizzbuzz

object FizzBuzz_Arita {
  def main(args:Array[String]):Unit = {
    (1 to 100).foreach(num => fizzBuzzIf(num))
  }
  def fizzBuzzIf(num:Int):Unit = {
    if(num % 15 == 0){
      println(num + " fizzbuzz")
    }else if(num % 3 == 0){
      println(num + " fizz")
    }else if(num % 5 == 0){
      println(num + " buzz")
    }else{
      println(num)
    }
  }
  def fizzBuzzMatch(num:Int):Unit = {
    num match{
      case num if num % 15 == 0 => {println(num + " fizzbuzz")}
      case num if num % 3 == 0 => {println(num + " fizz")}
      case num if num % 5 == 0 => {println(num + " buzz")}
      case num:Int => {println(num)}
    }
  }
}
