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
    Random random=new Random();
    private final List<Integer> list1=new ArrayList<>();
    private final List<Integer> list2=new ArrayList<>();

    final Object lock1=new Object();
    final Object lock2=new Object();


    public void main(){

        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list1.size());
        System.out.println(list2.size());

    }

    private void list1Add(){
        synchronized (lock1){
        try {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    }
    private void list2Add(){
       synchronized (lock2) {
           try {
               Thread.sleep(1);
               list2.add(random.nextInt(100));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }

    private void work(){
        for (int i = 0; i < 1000; i++) {
            list1Add();
            list2Add();
        }
    }
}
