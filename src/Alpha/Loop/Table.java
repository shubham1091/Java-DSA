package Alpha.Loop;

import java.util.Scanner;

public class Table {
    /*
     * Write a program to print the multiplication table of a number N, entered by
     * the user.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num :");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
        sc.close();
    }

}