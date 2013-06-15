package lesson.java.inheritance;

public class Zoo {
    public static void main(String args[]){
        final Animal messi = new Animal("messi", "Human");
        messi.say();

        final Dog pochi = new Dog("Pochi");
        pochi.bark();
        pochi.say();
    }
}
