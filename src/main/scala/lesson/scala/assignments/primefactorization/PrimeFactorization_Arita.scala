package lesson.scala.assignments.primefactorization

object PrimeFactorization_Arita {
  def main(args: Array[String]) = {
    primeNumberFactorization(99999).foreach(prime => println(prime))
  }

  def primeNumberFactorization(x: Int, primes: List[Int] = List()): List[Int] = {
    def divideByFirstPrime(x: Int, prime: Int = 2): Int = {
      def isPrime(n: Int) = (2 until n).forall(n % _ != 0)
      if ((isPrime(prime)) && (x % prime == 0))
        prime
      else
        divideByFirstPrime(x, prime + 1)
    }

    if (x == 1) {
      primes
    }
    else {
      val prime = divideByFirstPrime(x)
      prime :: primeNumberFactorization(x / prime, prime :: primes)
    }
  }
}
