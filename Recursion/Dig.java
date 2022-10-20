package Recursion;

public class Dig {
    public static void main(String[] args) {
        System.out.println(sum(852));
        System.out.println(pro(852));
        System.out.println(rev(1234));

    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }

    static int pro(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * pro(n / 10);
    }

    static int rev(int n) {
        int dig = (int) Math.log10(n);
        return help(n, dig);
    }

    static int help(int n, int len) {
        if (n % 10 == n) {
            return n;
        }
        int temp = n % 10;
        int m = (int) Math.pow(10, len);
        return temp * m + help(n / 10, --len);

    }
    static boolean pal(int n){
        int[]arr = Integer.
    }

    

}
