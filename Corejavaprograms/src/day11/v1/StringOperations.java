package day11.v1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // ✅ Using try-with-resources automatically closes Scanner
        try (Scanner sc = new Scanner(System.in)) {

            int startIndex, endIndex;
            String message, str;

            System.out.print("Enter the message: ");
            message = sc.nextLine();

            System.out.print("Enter the start index and end index: ");
            startIndex = sc.nextInt();
            endIndex = sc.nextInt();

            try {
                // Extract substring safely
                str = message.substring(startIndex, endIndex);
                System.out.println("Substring: " + str);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("❌ Error: Invalid index range! " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Please enter valid integer indexes!");
        } catch (Exception e) {
            System.out.println("❌ Unexpected error: " + e.getMessage());
        }

        System.out.println("Program ended successfully!");
    }
}