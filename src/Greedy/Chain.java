package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Chain {
    /*
     * Max length chain of pairs
     * you are given n pairs of numbers in every pair, the first number
     * is always smaller than the second number. a pair (c, d) can come
     * after pair (a,b) if b<c.
     * find the longest chain which can be formed from a given set of pairs
     * pairs = (5,24) (39,60) (5,28) (27,40) (50,90)
     * ans = 3
     */
    public static void main(String[] args) {
        int[][] pair = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pair[0][1];// Last selected pair end //chain end

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println("Maximum length of chain is " + chainLen);

    }

}
