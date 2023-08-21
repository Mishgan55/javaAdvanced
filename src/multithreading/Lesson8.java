package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Lesson8 {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue= new LinkedList<>();
        final int LIMIT=10;
        final Object lock=new Object();
        Random random=new Random();

        Thread thread1=new Thread(()->{
            while (true) {
                synchronized (lock) {
                    while (queue.size() == LIMIT) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    queue.offer(random.nextInt(10));
                    lock.notify();

                }
            }
        });

        Thread thread2=new Thread(()->{
            while (true) {
                synchronized (lock) {
                    while (queue.size() == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = queue.poll();
                    System.out.println("Element " + value + " had been removed from queue");
                    System.out.println("Queue size is " + queue.size());
                    lock.notify();
                }
                try {
                    Thread.sleep(1500);
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

}



