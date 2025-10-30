package day13;
public class ThreadDemo extends Thread {
    int n;
    String msg;

    // ✅ Constructor that takes int and String
    public ThreadDemo(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(msg + " thread count: " + i);
                Thread.sleep(500); // pause for half a second
            }
        } catch (InterruptedException e) {
            System.out.println(msg + " thread interrupted!");
        }
    }
}
