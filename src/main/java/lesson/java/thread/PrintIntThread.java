package lesson.java.thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintIntThread implements Runnable{
    private final int i;

    public PrintIntThread(int i){
        this.i = i;
    }

    public void run(){
        System.out.println("Thread " + i);
    }

    public static void main(String[] args){
        System.out.println("main thread start");

        ArrayList<PrintIntThread> arrayList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            System.out.println("creating Thread: " + i);
            arrayList.add(new PrintIntThread(i));
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        //ExecutorService executor = Executors.newFixedThreadPool(5);
        //ExecutorService executor = Executors.newCachedThreadPool();
        for(Runnable thread : arrayList){
            executor.execute(thread);
        }
        System.out.println("started all Thread");

        executor.shutdown();

        System.out.println("main thread end");
    }

}

