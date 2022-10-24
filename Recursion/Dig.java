package Recursion;

public class Dig {
    public static void main(String[] args) {
        System.out.println(sum(852));
        System.out.println(pro(852));
        System.out.println(rev(1234));
        System.out.println(zero(302004));

    }

    static int sum(int n) {
        // sum of digits in number
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }

    static int pro(int n) {
        // product of digits in number
        if (n == 0) {
            return 1;
        }
        return (n % 10) * pro(n / 10);
    }

    static int rev(int n) {
        // reverse numbers
        int dig = (int) Math.log10(n);
        return help(n, dig);// helper function
    }

    static int help(int n, int len) {
        if (n % 10 == n) {
            return n;
        }
        int temp = n % 10;
        int m = (int) Math.pow(10, len);
        return temp * m + help(n / 10, --len);

    }

    static int zero(int n) {
        // no of zero inside a number
        if (n % 10 == n) {
            return 0;
        }
        int temp = n % 10;
        int sum = zero(n / 10);
        if (temp == 0) {
            return ++sum;
        }
        return sum;
    }

    static int noOfSteps(int num) {// leetcode 1342
        return helper(num, 0);
    }

    static int helper(int num, int start) {
        if (num == 0) {
            return start;
        }
        if (num % 2 == 0) {
            return helper(num / 2, ++start);
        }
        return helper(num - 1, start + 1);
    }

}
