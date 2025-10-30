package day13;

public class RunnableDemo {
    public static void main(String[] args) {
        // Create a Runnable using an anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };

        // Create and start a Thread using the Runnable
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
