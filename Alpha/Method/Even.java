package Alpha.Method;

import java.util.Scanner;

public class Even {
    /*
     * Write a method named isEven that accepts an int argument The method should
     * return true if the arhument is even or false otherwise Also write a program
     * to test your method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = sc.nextInt();
        boolean check = isEven(con);
        if (con % 2 == 0 && check) {
            System.out.println("Even");
        } else {
            System.out.println("Not Even");
        }
        sc.close();
    }

    static boolean isEven(int arg) {
        return arg % 2 == 0;
    }

}
