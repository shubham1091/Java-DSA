package Alpha.Loop;

import java.util.Scanner;

public class Sum {
    /*
     * Write a program that reads a set of integers and then prints the sum of the
     * even and odd integers.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int choise = 1;
        do {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.println(" do you want to continue press 1 if yes 0 if no");
            choise = sc.nextInt();
        } while (choise >0);
        System.out.println("even sum is " + even);
        System.out.println("odd sum is " + odd);
        sc.close();
    }

}
