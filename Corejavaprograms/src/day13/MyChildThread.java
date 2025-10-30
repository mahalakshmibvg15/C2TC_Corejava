package day13;
public class MyChildThread extends Thread {

    @Override
    public void run() {
        int no = 0;
        while (no < 4) {
            no++;
            System.out.println("Number = " + no);

            try {
                Thread.sleep(500); // ✅ Use Thread.sleep(), not just sleep()
            } catch (InterruptedException exp) {
                System.out.println("Thread interrupted: " + exp.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyChildThread t1 = new MyChildThread();
        t1.start(); // ✅ start() invokes run() in a new thread

        // Check thread status
        System.out.println("Is thread alive? " + t1.isAlive());

        try {
            t1.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is thread alive after completion? " + t1.isAlive());
    }
}
