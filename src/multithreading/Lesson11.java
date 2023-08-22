package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Lesson11 {
    public static void main(String[] args) throws InterruptedException {
        Connection connection=Connection.getInstance();
        ExecutorService executorService=Executors.newFixedThreadPool(50);
        for (int i = 0; i <50 ; i++) {
        executorService.submit(()->{
            try {
                connection.work();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        }
        executorService.shutdown();
        executorService.awaitTermination(1,TimeUnit.DAYS);

    }
}

class Connection{
    private static final Connection instance=new Connection();
    private int countConnections;
    private final Semaphore semaphore=new Semaphore(5);
    private Connection() {
    }
    public static Connection getInstance(){
        return instance;
    }

    private void doWork() throws InterruptedException {
        synchronized (this){
            countConnections++;
            System.out.println(countConnections);
        }
        Thread.sleep(2000);
        synchronized (this){
            countConnections--;
        }
    }
    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }finally {
            semaphore.release();
        }
    }
}
