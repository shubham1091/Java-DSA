package Alpha.Loop;

import java.util.Scanner;

public class Factorial {
    /*
     * Write a program to find the factorial of any number entered by the user.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        long facto = 1;
        while (num > 0) {
            facto = facto * num;
            num--;
        }
        System.out.println(facto);
        sc.close();
    }

}
