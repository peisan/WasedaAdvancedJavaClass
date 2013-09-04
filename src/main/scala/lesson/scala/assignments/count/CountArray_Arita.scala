package lesson.scala.assignments.count

object CountArray_Arita {
  def main(args: Array[String]) :Unit = {
    val array = (1 to 100).toArray
    println(count(array))
    println(countIfFactorOfThreeOrFive(array))
    println(countIf(x => x % 2 == 0)(array))

    val countIfFactorOfFive = countIf(x => x % 5 == 0)(_)
    println(countIfFactorOfFive((1 to 1000).toArray))
    println(countIfFactorOfFive((1 to 2000).toArray))
    println(countIfFactorOfFive((1 to 3000).toArray))
  }
  def count(array:Array[Int]) = array.size
  def countIfFactorOfThreeOrFive(array:Array[Int]) : Int = {
    var count = 0
    for(i <- array){
      if(i % 5 == 0){
        count = count + 1
      }else if(i % 3 == 0){
        count = count + 1
      }
    }
    count
  }
  def countIf(f:Int => Boolean)(array : Array[Int]):Int = {
    array.filter(f).size
  }
}
