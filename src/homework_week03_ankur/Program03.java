package homework_week03_ankur;

import java.util.Scanner;


/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No : 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Program03 {

    public static void main(String[] args) {


        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Get the student's name
        System.out.println("Enter the student's name:  ");
        String name = sc.nextLine();

        // Get the student's roll number
        System.out.println("Enter the student's roll number: ");
        int rollNo = sc.nextInt();

        // Get the student's marks in Math, Science, and English
        System.out.println("Enter the student's marks in Math: ");
        int mathMarks = sc.nextInt();

        System.out.println("Enter the student's marks in Science: ");
        int scienceMarks = sc.nextInt();

        System.out.println("Enter the student's marks in English: ");
        int englishMarks = sc.nextInt();

        // Validate the marks
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }

        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }

        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }


        // Calculate the total marks
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        // Calculate the percentage
        float percentage = (float) totalMarks / 300 * 100;

        // Determine the result
        String result = "Fail";
        if (percentage >= 35) {
            result = "Pass";
        }


         // Determine the grade
        String grade = "F";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }


        // Print the mark sheet
        System.out.println("_______________________________");
        System.out.println("|       Mark Sheet             |");
        System.out.println("_______________________________");
        System.out.println("| Name       : "     + name +"             |");
        System.out.println("| Roll No:   " + rollNo + "                 |");
        System.out.println("_______________________________");
        System.out.println("| Subjects    :         Marks |");
        System.out.println("_______________________________");
        System.out.println("| Math    :    "                  + mathMarks +" |");
        System.out.println("| Science : "                  + scienceMarks +" |");
        System.out.println("| English : " +                  englishMarks +" |");
        System.out.println("_______________________________");
        System.out.println("| Total : "      + totalMarks + "               |");
        System.out.println("| Percentage :   " + percentage +"              |");
        System.out.println("| Result : "        + result +"                 |");
        System.out.println("| Grade : "       + grade +"                    |");
        System.out.println("_______________________________");


    }

}

