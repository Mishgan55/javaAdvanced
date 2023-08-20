package multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Lesson6 {
    private static BlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);
     private  static Random random=new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            while (true){

                try {

                    queue.put(random.nextInt(100));
                    System.out.println("Producer put number");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2=new Thread(()->{
            while (true){
            try {
                Thread.sleep(500);
                System.out.println( queue.size()+" consumer take");
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
