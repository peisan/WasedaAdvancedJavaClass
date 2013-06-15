package lesson.java.basics;

/**
 * Created with IntelliJ IDEA.
 * User: ippei
 * Date: 6/9/13
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Loop {
    public static void main(String args[]){
        final int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        // for
        for (int i = 0; i < intArray.length; i++){
            System.out.println(String.valueOf(intArray[i]));
        }

        // foreach
        for(int i : intArray){
            System.out.println(String.valueOf(i));
        }
    }
}
