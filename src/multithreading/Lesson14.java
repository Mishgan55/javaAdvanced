package multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Lesson14 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(1);

        Future<Integer>future=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random=new Random();
                int r=random.nextInt(10);
                if (r<5){
                    throw new Exception("Bad value");
                }
                return r;
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (ExecutionException e) {
            e.printStackTrace();
            Throwable cause = e.getCause();
            System.out.println(cause);
        }

    }



}
