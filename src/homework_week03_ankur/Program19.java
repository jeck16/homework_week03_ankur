package homework_week03_ankur;
import java.util.Scanner;

/**
 *  Write a Java program to calculate the average value of array elements.
 */

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("The average value of the elements in the array is: " + average);
    }
}
