package multithreading;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consumer();
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
class WaitAndNotify{

    public void producer() throws InterruptedException {
        synchronized (this){
            System.out.println("producer start...");
            wait();
            System.out.println("producer finished...");
        }


    }
    public void consumer() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            Thread.sleep(2000);
            System.out.println("push Enter...");
            scanner.nextLine();
            notify();
        }

    }
}
