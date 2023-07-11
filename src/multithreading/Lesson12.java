package multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lesson12 {
    public static void main(String[] args) throws InterruptedException {
        Run run = new Run();


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                run.firstThread();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                run.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        run.finished();


    }
}
class Run{
   private Account account1= new Account();
    private Account account2=new Account();

    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();

    private void takesLock(Lock l1,Lock l2){
        boolean firstLockTaken=false;
        boolean secondLockTaken=false;

        while (true){
            try {
                firstLockTaken=l1.tryLock();
                secondLockTaken= l2.tryLock();
            }finally {
                if (firstLockTaken && secondLockTaken){
                    return;
                }
                if (firstLockTaken){
                    l1.unlock();
                }
                if (secondLockTaken){
                    l2.unlock();
                }
            }

        }

    }

    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {

            takesLock(lock1,lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }

        }

    }
    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takesLock(lock2,lock1);
            try {
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }

    }

    public void finished(){
        System.out.println(account1.getValue());
        System.out.println(account2.getValue());
        System.out.println("Total balance= "+(account1.getValue()+account2.getValue()));
    }
}
class Account{
    private int value=10000;

    public void deposit(int amount){
        value+=amount;
    }
    public void withdraw(int amount){
        value-=amount;
    }
    public int getValue(){
        return value;
    }
    public static void transfer(Account a1, Account a2,int amount){
        a1.withdraw(amount);
        a2.deposit(amount);
    }

}
