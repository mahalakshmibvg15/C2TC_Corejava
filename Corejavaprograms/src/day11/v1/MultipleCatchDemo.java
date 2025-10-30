package day11.v1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("I am in main method");

        int numberOne, numberTwo, numberThree;

        // ✅ Use try-with-resources (automatically closes Scanner)
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                try {
                    System.out.print("Enter two numbers: ");
                    numberOne = sc.nextInt();
                    numberTwo = sc.nextInt();

                    numberThree = numberOne / numberTwo;
                    System.out.println("Result of division: " + numberThree);
                    break; // Exit loop if no error

                } catch (ArithmeticException e) {
                    System.out.println("❌ Error: Division by zero is not allowed!");
                } catch (InputMismatchException e) {
                    System.out.println("❌ Error: Please enter valid integers only!");
                    sc.nextLine(); // Clear invalid input
                } catch (Exception e) {
                    System.out.println("❌ Some other error occurred: " + e.getMessage());
                }
            }

        } // ✅ Scanner is automatically closed here

        System.out.println("Program completed successfully!");
    }
}
