package lesson.scala.thread

object ListPar {
  def main(args: Array[String]){
    println (scala.collection.parallel.availableProcessors + " CPUs")
    val list = BigInt(1) to 5000
    printTime {list.map(factorial(_))}
    printTime {list.par.map(factorial(_))}
  }

  private def factorial(num: BigInt): BigInt = {
    if (num == 1) 1 else num * factorial(num - 1)
  }

  private def printTime(transaction: => Unit){
    val start = System.currentTimeMillis()
    transaction
    println("spent " + (System.currentTimeMillis - start).toString + " ms")
  }

}
