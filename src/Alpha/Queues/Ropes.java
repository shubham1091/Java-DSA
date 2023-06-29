package Alpha.Queues;

import java.util.PriorityQueue;

public class Ropes {
    /*
     * Connext n ropes with minimmum cost
     * Given are N ropes of different lengths, the task is to connect
     * these ropes into one rope with minimmum cost such that the cost
     * to connect two ropes is equal to the sum of their lengths
     * input : N = 4, arr = [4,3,2,6]
     * output :29
     */
    public static void main(String[] args) {
        int[] len = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting ropes is " + cost(len, size));
    }

    private static int cost(int[] arr, int n) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            q.add(arr[i]);
        }
        int res = 0;
        while (q.size() > 1) {
            int first = q.poll();
            int second = q.poll();
            res += first + second;
            q.add(first + second);
        }
        return res;
    }

}
