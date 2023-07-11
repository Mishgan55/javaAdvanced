package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lesson10 {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                task.incrementFirst();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                task.incrementSecond();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();

    }
}
class Task{
    private int counter;
    private Lock lock=new ReentrantLock();

    public void incrementFirst(){
        lock.lock();
        increment();
        lock.unlock();

    }
    public void incrementSecond(){
        lock.lock();
        increment();
        lock.unlock();

    }
    public void increment(){
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }
    public void showCounter(){
        System.out.println(counter);
    }
}
