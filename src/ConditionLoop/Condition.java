package ConditionLoop;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Syntax of if statements:
         * if (boolean expression T or F ){
         * ----//body
         * }else {
         * ----//do this
         * }
         */

        System.out.print("Enter your salary : ");
        int salary = sc.nextInt();
        if (salary > 10000) {
            salary += 2000; // salary = salary +2000;
        } else {
            salary += 1000;
        }

        System.out.println("your salary is now " + salary);
        // Multiple if-else
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println("your salary is now " + salary);
        /*
         * here if we try to run the code even though salary is greater then 20000
         * but the increment is only going to be 2000 not 3000
         * for that we use switch statement to do
         */

        int a = 10;
        int b = 20;
        if (a == 10 && b == 20) {
            System.out.println("hello");
        }

        // we will discuss more about && when we do bitwise operations

        System.out.print("Enter a number: ");
        int cc = sc.nextInt();
        // ternary operator
        String check = (cc % 2) == 0 ? "even" : "odd";
        System.out.println(check);
        sc.close();
    }

}
