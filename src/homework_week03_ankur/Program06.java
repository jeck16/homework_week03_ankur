package homework_week03_ankur;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program06 {

    public static void main(String[] args) {

        //Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Get the number from the user
        System.out.println("Enter a number:  ");
        int number = sc.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd");
        }
    }
}
