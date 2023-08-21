package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson9 {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(5);

        ExecutorService executorService=Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            executorService.submit(new Processor(i,countDownLatch));
        }
        executorService.shutdown();

        countDownLatch.await();
        System.out.println("All latch had been open");

    }

}

class Processor implements Runnable {
    private int id;
    CountDownLatch count;

    public Processor(int id, CountDownLatch count) {
        this.id = id;
        this.count = count;
    }

    @Override
    public void run() {
        count.countDown();
        System.out.println("-1 latch");
    }
}
