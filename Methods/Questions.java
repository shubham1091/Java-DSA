package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        all();
        in.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    // print all the 3 digit armstrong numbers
    static boolean isArmstrong(int n) {
        // to check for armstrong numbers
        int org = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }
        return org == sum;
    }

    static void all() {
        // to pring all the armstrong numbers
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
