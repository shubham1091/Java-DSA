package Alpha.Condition;

import java.util.Scanner;

public class Leap {
    /*
     * Write a java program that takes a year from the user and print whether that
     * year is a leap year or not
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap year: " + year);
            } else if (year % 400 == 0) {
                System.out.println("Leap year: " + year);
            } else {
                System.out.println("Not a leap year: " + year);
            }
        } else {
            System.out.println("Not a leap year: " + year);
        }
        scanner.close();
    }

}
