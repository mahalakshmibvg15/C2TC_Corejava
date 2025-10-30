package day13;
public class ThreadLifeCycleDemo extends Thread {
    int n;
    String msg;

    // ✅ Constructor with int and String parameters
    public ThreadLifeCycleDemo(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(msg + " thread count: " + i);
                Thread.sleep(500); // wait 0.5 second
            }
        } catch (InterruptedException e) {
            System.out.println(msg + " thread interrupted!");
        }
    }
}
