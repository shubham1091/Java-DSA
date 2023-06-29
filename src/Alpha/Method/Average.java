package Alpha.Method;

import java.util.Scanner;

public class Average {
    /*
     * Write a java method to compute the average of three numbers
     */
    public static void main(String[] args) {
        avg();
    }

    static void avg() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println((a + b + c) / 3);
        in.close();
    }

}
