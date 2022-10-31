package Recursion;

public class Tiling {
    /*
     * Given a "2 x n "Board and tiles of size "2 x 1 ", count the number of
     * ways to tile the given board using the 2 x 1 tiles.
     * (A tile can either be placed horizontally or vertically)
     */
    public static void main(String[] args) {
        System.out.println(problem(3));
    }
    //this is not optimized for performance we need to learn dynamic programming for that
    static int problem(int n) {
        // 2 xn (floor size)
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int vert = problem(n - 1);
        // horizontal choice
        int hor = problem(n - 2);
        return vert + hor;
    }

}
