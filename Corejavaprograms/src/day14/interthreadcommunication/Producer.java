package day14.interthreadcommunication;
	public class Producer extends Thread {  // ✅ extend Thread
	    Q obj;

	    public Producer(Q obj) {  // ✅ constructor to receive shared object
	        this.obj = obj;
	        start(); // ✅ start the thread
	    }

	    public void run() {
	        int i = 0;
	        while (true) {
	            obj.put(i++);
	            try {
	                Thread.sleep(500); // small delay
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}
