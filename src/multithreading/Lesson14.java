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
        ExecutorService executorService=Executors.newFixedThreadPool(1);

      Future<Integer> future= executorService.submit(()->{
          Random random=new Random();
         int number= random.nextInt(10);
         if (number<5)
             throw new Exception("Number less then 5");
          return number;
      });
      executorService.shutdown();

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            System.out.println(cause.getMessage());
        }

    }
}
