 package day14.synchronization;
 public class Account {
     private int balance = 1000;

     // synchronized method for withdrawal
     public synchronized void withdraw(int amount) {
         System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

         if (balance >= amount) {
             System.out.println(Thread.currentThread().getName() + " is processing...");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }

             balance -= amount;
             System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
         } else {
             System.out.println(Thread.currentThread().getName() + " — Insufficient balance!");
         }
     }

     public int getBalance() {
         return balance;
     }
 }