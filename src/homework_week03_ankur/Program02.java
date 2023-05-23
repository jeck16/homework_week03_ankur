package homework_week03_ankur;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:   ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(year + " is " + (isLeapYear ? "a leap year" : "not a leap year"));


    }
}


