package ConditionLoop;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character");
        // there is no such thing as nextChar so we need to do this to get a char
        char ch = sc.next().trim().charAt(0);
        /*
         * what is .trim() it is basically means that remove all the extre space
         * we will discuss about .trim() and charAt() in String
         */

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else {
            System.out.println("Lower case");
        }
        sc.close();
    }

}
