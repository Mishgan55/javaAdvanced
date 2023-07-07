package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) throws InterruptedException {
       new Worker().main();
    }

}
class Worker{
    Random random= new Random();

    List<Integer> list1= new ArrayList<>();
    List<Integer> list2= new ArrayList<>();

    Object lock1=new Object();
    Object lock2=new Object();

    public void addList1() throws InterruptedException {
        synchronized (lock1) {
            list1.add(random.nextInt(100));
            Thread.sleep(1);

        }
    }

    public void addList2() throws InterruptedException {
        synchronized (lock2) {
            list2.add(random.nextInt(100));
            Thread.sleep(1);

        }
    }

    public void work() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            addList1();
            addList2();

        }

    }

    public void main() throws InterruptedException {

        long finish = System.currentTimeMillis();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        long start = System.currentTimeMillis();

        System.out.println(start-finish+"ms");
        System.out.println(list1.size());
        System.out.println(list2.size());


    }
}
