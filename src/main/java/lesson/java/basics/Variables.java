package lesson.java.basics;

public class Variables {
    public static void main(String args[]){
        final String str1 = "hi";
        String str2 = "he";
        str2 += "llo";
        final int int1 = 100;
        int int2 = 200;
        int2 += 100;
        System.out.println(
            str1 + str2 + int1 + int2);
    }
}
