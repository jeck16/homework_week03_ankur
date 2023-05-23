package homework_week03_ankur;

import java.util.Scanner;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Program11 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Print the numbers between 1 to 100 which can be divided by 3 and 5 separately
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
