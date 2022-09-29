package Methods;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        // In java any function which is in a class is known as method
        Scanner in = new Scanner(System.in);
        // Q : take input of 2 numbers and print the sum
        /*
         * System.out.print("Enter number 1:");
         * int num1 = in.nextInt();
         * System.out.print("Enter number 2:");
         * int num2 = in.nextInt();
         * int sum = num1 + num2;
         * System.out.println(sum);
         */
        sum();

        int ans = sum2();// returning an integer value
        System.out.println(ans);
        in.close();
    }

    /*
     * syntax :
     * access modifier return_type name (){
     * ----return statement;
     * }
     */

    // we will learn about access modifier in OOPs
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        in.close();
    }

    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        in.close();
        return num1 + num2;// return means the function ends here
    }

}
