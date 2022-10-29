package Arrays.Basic.SubArray;

public class Stocks {
    /*
     * you are given an array peices where prices[i] is the price of a given stock
     * on the ith day.You want to maximize your profit by choosing a single day to
     * buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     */
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Bs(prices));
    }

    static int Bs(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int mxPrfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buy < arr[i]) {
                int pro = arr[i] - buy;
                mxPrfit = Math.max(mxPrfit, pro);
            } else {
                buy = arr[i];
            }
        }
        return mxPrfit;
    }
}
