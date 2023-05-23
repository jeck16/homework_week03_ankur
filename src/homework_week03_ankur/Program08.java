package homework_week03_ankur;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program08 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Get the alphabet from the user
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = sc.next().charAt(0);

        // Check if the alphabet is valid
        if (alphabet >= 'A' && alphabet <= 'F') {
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
            }
        } else {
            System.out.println("Invalid entry.");
        }
    }
}
