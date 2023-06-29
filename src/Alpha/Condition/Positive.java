package Alpha.Condition;

import java.util.Scanner;

public class Positive {
    /*
     * Write a java program to get a number from the user and print whether it is
     * positive or negative.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        sc.close();

    }

}
