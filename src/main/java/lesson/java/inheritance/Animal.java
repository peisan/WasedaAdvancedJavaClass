package lesson.java.inheritance;

public class Animal {
    public final String name;
    public final String kind;

    public Animal(String name, String kind){
        this.name = name;
        this.kind = kind;
    }

    public void say(){
        System.out.println("Hi, My name is " + name);
        System.out.println("I am " + kind);
    }
}
