package ConditionLoop.Loop;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q: print numbers from 1 to 5

        /*
         * System.out.println(1);
         * System.out.println(2);
         * System.out.println(3);
         * System.out.println(4);
         * System.out.println(5);
         */

        // this is not the most efficient way to do this

        /*
         * Syntax of for loop:
         * for (initialisation; condition;increment/decrement){
         * ----body
         * }
         */

        System.out.println("for loops");
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }
        // look how small the code has become
        System.out.print("Ente N to print number from 1 to N: ");
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

        // while loops
        /*
         * Syntax :
         * while (condition){
         * ----body
         * }
         */

        /*
         * why we need to use while loop instade of for loop it is becouse when you know
         * how many times the loop is going to run we use for loop and when you dont
         * know how many times the loop is going to run we use while loop instade of for
         * loop
         */

        /*
         * and one more reason to use while loop over for loop is to make the code more
         * cleaner
         */
        System.out.println("while loop");
        int hi = 1;
        while (hi <= 5) {
            System.out.println(hi);
            hi++;
        }

        // do while
        /*
         * syntax :
         * do {
         * ----body
         * }while (condition);
         */

        /*
         * why we use do while insted of while the ans for that is when we use while
         * loop the loop will not going to run if the condition is not true at the first
         * place but when we use do while the loop will going to run atleast once even
         * if the condition is false at the beginning of the loop
         */
        System.out.println("do-while loop");
        int nic = 1;
        do {
            System.out.println(nic);
            nic++;
        } while (nic <= 5);

        sc.close();

    }

}
