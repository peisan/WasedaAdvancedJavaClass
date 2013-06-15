package lesson.java.file;

import java.io.PrintWriter;

public class FileWrite {
    public static void main(String args[]){
        try{
            String lines[] = {"java", "a", "b", "c", "d", "e"};
            PrintWriter writer = new PrintWriter("data/java_out.txt");
            for(String line: lines){
               writer.println(line);
            }
            writer.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
