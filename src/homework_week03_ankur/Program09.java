package homework_week03_ankur;
import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class Program09 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Get the alphabet from the user
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = sc.next().charAt(0);

        // Use switch statement to print the city name
        switch (alphabet) {
            case 'A':
                System.out.println("The city name is Ahmedabad.");
                break;
            case 'B':
                System.out.println("The city name is Bangalore.");
                break;
            case 'C':
                System.out.println("The city name is Chennai.");
                break;
            case 'D':
                System.out.println("The city name is Delhi.");
                break;
            case 'E':
                System.out.println("The city name is Hyderabad.");
                break;
            case 'F':
                System.out.println("The city name is Pune.");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }
}
