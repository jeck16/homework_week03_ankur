package homework_week03_ankur;
import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program07 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Get the sales id
        System.out.println("Enter the sales id: ");
        int salesId = sc.nextInt();

        // Get the seller's name
        System.out.println("Enter the seller's name: ");
        String sellerName = sc.next();

        // Get the sales amount
        System.out.println("Enter the sales amount: ");
        int salesAmount = sc.nextInt();

        // Get the salary basic
        System.out.println("Enter the salary basic: ");
        int salaryBasic = sc.nextInt();

        // Calculate the commission
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print the commission
        System.out.println("The commission is: " + commission);
    }

}
