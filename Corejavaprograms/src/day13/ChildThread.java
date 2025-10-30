package day13;
public class ChildThread extends Thread {
    @Override
    public void run() {
        String msg = "Hello from ChildThread";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println(msg + " - " + Thread.currentThread().getName());
    }
}
