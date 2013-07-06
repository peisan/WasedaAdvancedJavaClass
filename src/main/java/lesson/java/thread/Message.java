package lesson.java.thread;

public class Message {

    private String message;

    public static void main(String arg[]) {
        final Message message = new Message();

        Runnable sender[] = new Runnable[10];
        Runnable receiver[] = new Runnable[10];
        for (int i = 0; i < 10; i++) {
            final int num = i;
            sender[i] = new Runnable() {
                @Override
                public void run() {
                    message.sendMessage("Hello I am thread" + num);
                }
            };

            receiver[i] = new Runnable() {
                @Override
                public void run() {
                    System.out.println(message.receiveMessage());
                }
            };
        }

        for (int i = 0; i < 10; i++) {
            sender[i].run();
            receiver[i].run();
        }

        for (int i = 0; i < 10; i++) {
        }
    }

    synchronized void sendMessage(String msg) {
        try {
            while (message != null) {
                wait();
            }
            message = msg;
            notifyAll();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    synchronized String receiveMessage() {
        try {
            while (message == null) {
                wait();
            }
            String s = message;
            message = null;
            notifyAll();
            return s;
        } catch (Exception e) {
            System.err.println(e);
        }
        return "";
    }


}


