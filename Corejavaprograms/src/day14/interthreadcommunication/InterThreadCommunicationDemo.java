package day14.interthreadcommunication;
public class InterThreadCommunicationDemo{
    int num;
    boolean valueSet = false;

    synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Put: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Got: " + num);
        valueSet = false;
        notify();
    }
}
