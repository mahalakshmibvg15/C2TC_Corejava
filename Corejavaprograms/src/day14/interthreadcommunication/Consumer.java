package day14.interthreadcommunication;
//Q is the shared resource class
public class Consumer extends Thread {
 Q obj;

 public Consumer(Q obj) {
     this.obj = obj;
     start();  // start the thread automatically
 }

 public void run() {
     while (true) {
         obj.get(); // method to consume from the shared object
     }
 }
}
