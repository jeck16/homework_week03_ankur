package homework_week03_ankur;
import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Enter a character: ");
        char input = sc.next().charAt(0);

        // Check if the input is a number, alphabet, or symbol
        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        } else if (Character.isAlphabetic(input)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }
    }
}
