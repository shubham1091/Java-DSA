package Recursion;

;
public class Binary {
    /*
     * Binary Strings Problem
     * print all binary strings of size N without cosecutive ones
     */
    public static void main(String[] args) {
        str(3, 0, "");
    }

    static void str(int n, int ls, String st) {
        if (n == 0) {
            System.out.println(st);
            return;
        }
        // kaam
        str(n - 1, 0, st + "0");
        if (ls == 0) {
            str(n - 1, 1, st + "1");
        }
    }

}
