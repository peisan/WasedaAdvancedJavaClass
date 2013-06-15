package lesson.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {
    public static void main(String args[]){
        try{
            File file = new File("data/in.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader =
                    new BufferedReader(filereader);
            String str;
            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
            bufferedReader.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
