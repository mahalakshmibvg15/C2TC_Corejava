package day11.trycatch;
	public class TryCatchExample {

	    // ✅ Define performDivision method outside main()
	    public static int performDivision(int x, int y) {
	        int result = 0;
	        try {
	            System.out.println("I am in try block");
	            result = x / y;
	        } catch (ArithmeticException e) {
	            System.out.println("I am in catch block: " + e.getMessage());
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        System.out.println("---------- Division Program ----------");

	        int result = performDivision(10, 2);
	        System.out.println("Division of 10 / 2 = " + result);

	        System.out.println("--------------------------------------");

	        result = performDivision(12, 0);
	        System.out.println("Division of 12 / 0 = " + result);

	        System.out.println("--------------------------------------");
	    }
	}
