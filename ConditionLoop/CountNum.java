package ConditionLoop;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ch = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == ch) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
        sc.close();
    }

}
