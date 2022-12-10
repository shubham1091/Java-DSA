package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
    /*
     * Fractional Knapsack
     * Given the weights and values of N items, put these items in
     * a knapsack of capacity W to get the maximum total value in the
     * Knapsack
     * value = [60, 100, 120]
     * weight = [10, 20, 30]
     * W = 50
     * ans = 240
     */
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int W = 50;
        System.out.println("Final value = " + getMaxValue(val, weight, W));
    }

    private static int getMaxValue(int[] val, int[] weight, int W) {
        double r[][] = new double[val.length][2];
        // oth col => idx; 1st col =>ratio;
        for (int i = 0; i < val.length; i++) {
            r[i][0] = i;
            r[i][1] = val[i] / (double) weight[i];
        }
        //ascending order
        Arrays.sort(r, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int fVal = 0;
        for (int i = r.length - 1; i >= 0; i--) {
            int idx = (int) r[i][0];
            if (capacity >= weight[idx]) {
                //include full item
                fVal += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                fVal += (r[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return fVal;
    }

}
