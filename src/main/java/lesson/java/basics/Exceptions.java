package lesson.java.basics;

public class Exceptions {
    public static void main(String args[]){
        try{
            throw new IndexOutOfBoundsException("Sample Exception");
            //throw new NullPointerException("Sample Exception");
            //throw new Exception("Sample Exception");
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch(NullPointerException e){
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("done");
        }
    }
}
