package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson9 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count=new CountDownLatch(3);

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i, count));

        }
        executorService.shutdown();
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            count.countDown();
            
        }

    }

}
class Processor implements Runnable{
    private int id;
    CountDownLatch count;

    public Processor(int id, CountDownLatch count) {
        this.id = id;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            count.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id "+id+" proceeded");

    }
}