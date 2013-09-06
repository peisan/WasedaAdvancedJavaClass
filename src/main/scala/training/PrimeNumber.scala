package training

object PrimeNumber {
  def main(args: Array[String]) {

    def isPrime(n: Int):Boolean = n match {
      case i if (i <= 1) => false
      case _ => List.range(2, n).forall(x => n % x !=0)
    }
    for(n<- 1 to 10){
      println(n + isPrime(n).toString)
    }
  }
}
