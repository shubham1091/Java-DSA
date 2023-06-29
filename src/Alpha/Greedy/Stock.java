package Alpha.Greedy;

public class Stock {
    /*
     * Best time to buy and sell stock
     * Givven an array prices[] of length N representiong the prices
     * of the stocks on different days, the task is to find the maximum
     * profit possible for buying and selling the stocks on different days
     * Note: Stock must be bought before being sold.
     * input prices[]={7,6,4,3,1}
     * output = 0
     */
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        int max_profit = maxProfit(prices, n);
        System.out.println(max_profit);
    }

    private static int maxProfit(int[] prices, int n) {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max_profit) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

}
