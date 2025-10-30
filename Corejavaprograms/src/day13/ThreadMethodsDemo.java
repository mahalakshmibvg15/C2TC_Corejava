package day13;
public class ThreadMethodsDemo extends Thread {
    int n;

    // ✅ Constructor with parameters (int, String)
    public ThreadMethodsDemo(int n, String name) {
        super(name);   // sets the thread name
        this.n = n;    // store the value of n
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
