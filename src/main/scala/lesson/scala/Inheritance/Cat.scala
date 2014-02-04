package lesson.scala.Inheritance

/**
 * Created with IntelliJ IDEA.
 * User: fujiokashigeki
 * Date: 2013/09/04
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
class Cat { (name:String) extends Animal(name, "Dog"){
  def bark() = println("Wan!")

}
