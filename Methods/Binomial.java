package Methods;

public class Binomial {
    public static void main(String[] args) {
        System.out.println(bio(5, 2));
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
