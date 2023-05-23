package homework_week03_ankur;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array
 */

public class Program17 {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {10, 5, 2, 7, 9, 3, 8, 6, 4};

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted numeric array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        // String array
        String[] strings = {"apple", "banana", "cat", "dog", "elephant"};

        // Sort the array
        Arrays.sort(strings);

        // Print the sorted array
        System.out.println("Sorted string array:");
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}
