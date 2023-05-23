package homework_week03_ankur;
import java.util.Scanner;


/**
 * Write a Java program to test if an array contains a specific value
 */

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int value = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + value + " is in the array.");
        } else {
            System.out.println("The value " + value + " is not in the array.");
        }
    }
}
