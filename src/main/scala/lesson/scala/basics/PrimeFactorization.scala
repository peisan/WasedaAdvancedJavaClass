package lesson.scala.basics

object PrimeFactorization {
  def main(args: Array[String]) = {
    primeNumberFactorization(1000).foreach(prime => println(prime))
  }
  def primeNumberFactorization(x: Int, primes: List[Int] = List()): List[Int] = {
    if (x == 1) {
      primes
    }
    else {
      val prime = divideByFirstPrime(x)
      prime :: primeNumberFactorization(x / prime, prime :: primes)
    }
  }
  def divideByFirstPrime(x: Int, prime: Int = 2): Int = {
    if ((isPrime(prime)) && (x % prime == 0))
      prime
    else
      divideByFirstPrime(x, prime + 1)
  }
  def isPrime(n: Int) = (2 until n).forall(n % _ != 0)
}
