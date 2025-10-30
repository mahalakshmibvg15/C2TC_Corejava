package day11.trycatch;
public class TryCatchDemo{

    // Method to perform division
    public static int performDivision(int a, int b) {
        int result = 0;
        try {
            result = a / b;  // May throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Error: Division by zero is not allowed!");
        }
        return result;
    }

    public static void main(String[] args) {
        int result;

        System.out.println("---------- Division Program ----------");

        result = performDivision(10, 2);
        System.out.println("Division of 10 / 2 = " + result);

        System.out.println("--------------------------------------");

        result = performDivision(12, 3);
        System.out.println("Division of 12 / 3 = " + result);

        System.out.println("--------------------------------------");

        result = performDivision(15, 0); // Division by zero test
        System.out.println("Division of 15 / 0 = " + result);

        System.out.println("--------------------------------------");
    }
}