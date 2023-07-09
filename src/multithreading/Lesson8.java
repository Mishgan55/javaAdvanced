package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson8 {
    public static void main(String[] args) throws InterruptedException {

        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consumer();
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


class ProducerConsumer{
    private Queue<Integer> queue = new LinkedList<>();
    private  static final int LIMIT=10;
    private final Object lock=new Object();

    public void producer() throws InterruptedException {
        int value=0;
    while (true)   {
        synchronized (lock){
            while (queue.size()==LIMIT){
                lock.wait();
            }
            queue.offer(value++);
            lock.notify();



        }
    }

    }
    public void consumer() throws InterruptedException {

        while (true){
            synchronized (lock){
                while (queue.size()==0){
                    lock.wait();
                }
                int value=queue.poll();
                System.out.println("Queue size= "+queue.size());
                System.out.println(value);
                lock.notify();
            }
            Thread.sleep(1000);
        }

    }
}
