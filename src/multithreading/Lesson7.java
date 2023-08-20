package multithreading;


import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread thread1=new Thread(()->{
        synchronized (lock){
            System.out.println("Producer is starting");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("producer resumed");
        }
    });
        Scanner scanner = new Scanner(System.in);
        Thread thread2 =new Thread(()->{
            synchronized (lock){
                try {
                    Thread.sleep(2000);
                    System.out.println("Waiting for return case");
                    scanner.nextLine();
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread1.join();
    }
}
