package day10;
import java.util.Arrays;  // ✅ Add this import statement

public class ArrayClassDemo {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35, 18, 14};

        // To print the elements in one line
        System.out.println("Array is : " + Arrays.toString(intArr));  // ✅ Corrected 'Array' to 'Arrays'

        // Sorting the array
        Arrays.sort(intArr);

        System.out.println("-----------After Sorting-----------");
        System.out.println("Array is : " + Arrays.toString(intArr));  // ✅ Corrected 'Arravs' typo to 'Arrays'
    }
}
