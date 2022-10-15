package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fibonachi(n));
    }

    static int fibonachi(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}
