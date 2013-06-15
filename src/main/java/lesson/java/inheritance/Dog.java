package lesson.java.inheritance;

public class Dog extends Animal{
    Dog(String name){
        super (name, "Dog");
    }
    public void bark(){
        System.out.println("Wan!");
    }
}
