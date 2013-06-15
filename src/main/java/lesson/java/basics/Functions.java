package lesson.java.basics;

public class Functions {
    public static void main(String args[]){
        Functions f = new Functions();
        f.sayHello();
        f.say(f.gao());
    }

    void sayHello(){
        System.out.println("Hello");
    }

    void say(String word){
        System.out.println(word);
    }

    String gao(){
        return "Gao!";
    }
}
