package lesson.java.basics;

public class Human {
    public final String firstName;
    public final String lastName;
    private int age;

    Human(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public static void main(String args[]){
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        Human me = new Human(firstName, lastName, age);
        System.out.println("My name is " + me.getName()
                + " I am " + me.age + " years old");
    }
}
