package multithreading;

import java.util.Random;

public class Lesson13 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                for (int i = 0; i < 1_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("thread interrupted");
                        break;
                    }
                    Math.sin(random.nextInt(100));

                }
            }
        });
        System.out.println("Thread starts");
        thread.start();

        thread.interrupt();
        thread.join();
        System.out.println("thread finished");
    }
}
