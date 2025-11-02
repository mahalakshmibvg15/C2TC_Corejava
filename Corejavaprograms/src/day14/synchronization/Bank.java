package day14.synchronization;
//Create a custom exception
class Bank extends Exception {
 public DepositLimitExceedsException(String message) {
     super(message);
 }
}

public class Bank {
 // fields
 int balance = 10000;
 static final int MINBAL = 5000;
 static final int DAILY_LIMIT = 25000;

 // synchronized deposit method
 public synchronized void deposit(int amount) throws DepositLimitExceedsException {
     if (amount > DAILY_LIMIT) {
         throw new DepositLimitExceedsException("Deposit limit exceeded! Maximum allowed: " + DAILY_LIMIT);
     }

     balance += amount;
     System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
     System.out.println("Updated Balance: " + balance);
 }

 // synchronized withdraw method
 public synchronized void withdraw(int amount) {
     if (balance - amount < MINBAL) {
         System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Minimum balance limit reached!");
     } else {
         balance -= amount;
         System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
         System.out.println("Updated Balance: " + balance);
     }
 }
}