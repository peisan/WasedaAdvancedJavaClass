package lesson.scala.basics

object ConditionalBranch {
  def main(args: Array[String]) = {
    val i = args(0).toInt
    if(i > 10){
      System.out.println("bigger than 10")
    }else{
      System.out.println("smaller than 11")
    }

    i match{
      case i if i > 10 => println("bigger than 10")
      case _ => println("smaller than 11")
    }
  }
}
