package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Coins {
    /*
     * Indian Coins
     * We are given an infinite supply of denominations
     * [1 , 2 , 5 , 10 , 20 , 50 , 100 , 500 , 2000 ]
     * Find min no. of coins/notes to make change for a value V.
     * V 121
     * ans = 3 (100+20+1)
     * V = 590
     * ans = 4 (500+50+20+20)
     */
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        int amt = 1059;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amt) {
                while (coins[i] <= amt) {
                    count++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("total min coins used = " + count);
        System.out.println(ans);
    }
}