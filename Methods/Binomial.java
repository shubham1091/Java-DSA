package Methods;

import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and r to findout binomial coefficient");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(bio(n, r));
        sc.close();
    }

    static int factorial(int num) {
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }

    static int bio(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr = factorial(n - r);
        return fact_n / (fact_r * nmr);
    }

}
