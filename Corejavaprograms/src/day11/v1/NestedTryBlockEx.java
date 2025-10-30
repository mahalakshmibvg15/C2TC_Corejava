package day11.v1;
public class NestedTryBlockEx {
    public static void main(String[] args) {
        int x, y, z;

        System.out.println("----- Nested Try Block Example -----");

        try {
            // Outer try block
            try {
                x = Integer.parseInt(args[0]); // read from command line
                y = Integer.parseInt(args[1]);

                try {
                    // Inner try block
                    z = x / y;
                    System.out.println("Division result (z) = " + z);
                } catch (ArithmeticException e) {
                    System.out.println("❌ Error: Division by zero is not allowed!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("❌ Error: Please provide two command line arguments!");
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Please enter valid integer numbers!");
            }

        } catch (Exception e) {
            System.out.println("❌ Some other error occurred: " + e.getMessage());
        }

        System.out.println("Program ended successfully!");
    }
}
