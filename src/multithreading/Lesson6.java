package multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Lesson6 {

    private static BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
    public static void main(String[] args) throws InterruptedException {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

    public static void produce() throws InterruptedException {
        Random random = new Random();
        while (true){
            queue.put(random.nextInt(50));
            Thread.sleep(100);
            System.out.println("producer put "+queue.size());
        }

    }
    public static void consume() throws InterruptedException {
        while (true){
            queue.take();
            System.out.println("Consumer take and size="+ queue.size());
            Thread.sleep(200);
        }

    }
}
