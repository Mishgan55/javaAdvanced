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
                try {
                    run.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    run.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
    private final Account account1=new Account();
    private final Account account2=new Account();

    Lock lock1=new ReentrantLock();
    Lock lock2=new ReentrantLock();

    Random random = new Random();

    private void takesLock(Lock l1,Lock l2) throws InterruptedException {
        boolean firstLockIsTaken=false;
        boolean secondLockIsTaken=false;

        while (true){
            try {
            firstLockIsTaken = l1.tryLock();
            secondLockIsTaken=l2.tryLock();
            }finally {

                if (firstLockIsTaken && secondLockIsTaken) {
                    return;
                }
                if (firstLockIsTaken) {
                    l1.unlock();
                }
                if (secondLockIsTaken) {
                    l2.unlock();
                }
            }
            Thread.sleep(10);
        }
    }

    public void firstThread() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            takesLock(lock1,lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }

    }
    public void secondThread() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            takesLock(lock1,lock2);
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
    private  int balance= 20000;

    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        balance-=amount;
    }
    public static void transfer(Account acc1,Account acc2,int amount){
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
    public int getValue(){
        return balance;
    }



}
