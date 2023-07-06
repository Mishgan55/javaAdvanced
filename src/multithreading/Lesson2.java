package multithreading;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread2.shoutDown();


    }
}
class MyThread2 extends Thread{
    private volatile boolean runner=true;
    @Override
    public void run() {
        while (runner){
            System.out.println("hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shoutDown(){
        this.runner=false;
    }
}
