package ConditionLoop;

public class Condition {
    public static void main(String[] args) {
        /*
         * Syntax of if statements:
         * if (boolean expression T or F ){
         * ----//body
         * }else {
         * ----//do this
         * }
         */

        int salary = 25400;
        if (salary > 10000) {
            salary += 2000; // salary = salary +2000;
        } else {
            salary += 1000;
        }

        // Multiple if-else

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        int a = 10;
        int b = 20;
        if (a == 10 && b == 20) {
            System.out.println("hello");
        }

        //we will discuss more about && when we do bitwise operations
    }

}
