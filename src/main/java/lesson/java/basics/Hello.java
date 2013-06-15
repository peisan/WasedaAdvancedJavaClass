package lesson.java.basics;

public class Hello{
    public static void main(String args[]){
            Person person = new Person(args[0]);
            System.out.println("Hello " + person.name);
        }
}

class Person{
    public final String name;
    public Person(String name){
        this.name = name;
    }
}
