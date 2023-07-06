package multithreading;

public class Lesson1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread1 = new Thread(new Runner());
        thread1.start();

    }
}

    class Runner implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from Runner");

            }
        }
    }
    class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from Thread");

            }
        }
    }

