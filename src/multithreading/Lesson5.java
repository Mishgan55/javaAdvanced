package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Lesson5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 12; i++)
            executorService.submit(new Work(i));

        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.DAYS);

    }

}
class Work implements Runnable{
    int id;

    public Work(int id) {
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println("Work "+id+" completed");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}