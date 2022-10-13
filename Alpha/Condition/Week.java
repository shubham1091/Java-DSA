package Alpha.Condition;

import java.util.Scanner;

public class Week {
    /*
     * Write a java program to input week number(1-7) and print day of week name
     * using switch case
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7:");
        int week = sc.nextInt();
        switch (week) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Invalid Input");
        }
        sc.close();
    }

}
