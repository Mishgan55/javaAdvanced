package multithreading;

public class Lesson3 {
    int counter;

    public void count() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();


                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();


                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

    public synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        new Lesson3().count();


    }
}
