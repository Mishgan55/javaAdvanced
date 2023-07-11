package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Lesson11 {
    public static void main(String[] args) throws InterruptedException {

        Connection connection = Connection.getConnection();
        ExecutorService executorService= Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });


        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);


    }
}
class Connection{
    private static Connection connection=new Connection();
    private int countConnections;
    Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getConnection(){
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try{
        doWork();
        }finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this){
            countConnections++;
        }
        System.out.println(countConnections);
        Thread.sleep(5000);
        synchronized (this){
            countConnections--;
        }
    }
}
