package Greedy;

import java.util.Arrays;

public class Pairs {
    /*
     * Min Absolute difference pairs
     * Given two arrays A and B of equal length n. Pair each element
     * of array A to an element in array B, such that sum S of absolute
     * differences of all the pairs is minimum
     * A = [1,2,3]
     * B = [2,1,3]
     * ans = 0
     */
    private static int AbDiff(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int mx = 0;
        for (int i = 0; i < A.length; i++) {
            mx += Math.abs(A[i] - B[i]);
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] A = { 4, 1, 8, 7 };
        int[] B = { 2, 3, 6, 5 };
        System.out.println(AbDiff(A, B));
    }

}
