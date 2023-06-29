package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // System.out.println(fibonachi(n));
        System.out.println(fibo(n));
    }

    static int fibonachi(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    // Using the formula to get febonachi
    static long fibo(int n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

}
