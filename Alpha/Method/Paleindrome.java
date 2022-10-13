package Alpha.Method;

import java.util.Scanner;

public class Paleindrome {
    /*
     * Write a java program to check if a number is a palindrome in java?
     * (121 is a palindrome, 321 is mot)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("The given number is a palindrome");

        } else {
            System.out.println("The given number is not a palindrome");
        }
        sc.close();
    }

    static boolean isPalindrome(int num) {
        int cp = num;
        int check = 0;
        while (cp > 0) {
            int temp = cp % 10;
            check = check * 10 + temp;
            cp = cp / 10;
        }
        if (check == num) {
            return true;
        }
        return false;
    }

}
