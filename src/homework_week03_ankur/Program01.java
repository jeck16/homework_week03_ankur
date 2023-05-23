package homework_week03_ankur;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int number = sc.nextInt();

        String evenOdd =  number % 2==0 ? " even " : " odd ";
        System.out.println(number + " is " + evenOdd);

    }

}
