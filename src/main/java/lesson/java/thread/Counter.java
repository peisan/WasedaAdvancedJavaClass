package lesson.java.thread;

public class Counter {

    int count;

    /*synchronized*/ void countUp(){
        int tmp = count + 1;
        try{
            Thread.sleep(1);
        }catch (InterruptedException e){}
        count = tmp;
    }


    public static void main(String[] args) {
        final Counter counter = new Counter();
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(){
                @Override
                public void run() {
                    counter.countUp();
                }
            };
            threads[i].start();
        }
        for (int i = 0; i < 1000; i++) {
            try{
                threads[i].join();
            }catch(Exception e){}
        }
        System.out.println(counter.count);
    }
}

