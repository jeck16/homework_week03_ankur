package homework_week03_ankur;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {

        //Create a Scanner object tp read user input
        Scanner sc= new Scanner(System.in);

        //Get the employee's id
        System.out.println("Enter the employee's id");
        int employeeId = sc.nextInt();

        //Get the employee's name
        System.out.println("Enter the employee's name: ");
        String employeeName = sc.next();

        // Get the employee's basic salary
        System.out.println("Enter the employee's basic salary: ");
        int basicSalary = sc.nextInt();

        // Calculate the HRA
        double HRA = basicSalary * 0.10;

        // Calculate the DA
        double DA = basicSalary * 0.08;

        // Calculate the TA
        double TA = basicSalary * 0.09;

        // Calculate the PF
        double PF = basicSalary * 0.20;

        // Calculate the Gross salary
        double grossSalary = basicSalary + HRA + DA + TA - PF;

        // Print the salary slip
        System.out.println("______________________________");
        System.out.println("|          Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : " + employeeId + "        |");
        System.out.println("| Employee Name : " + employeeName + "       |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : " + basicSalary + "    |");
        System.out.println("| HRA 10% : " + HRA + "         |");
        System.out.println("| TA 8% : " + TA + "            |");
        System.out.println("| DA 9% : " + DA + "            |");
        System.out.println("| PF - 20& : " + PF + "          |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : " + grossSalary + " |");
        System.out.println("|===========================|");

    }
}
