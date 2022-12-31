package Heaps;

import java.util.PriorityQueue;

public class Sliding {
    /*
     * Sliding window maximum
     * maximum of all subarrays of size K
     * 1,2,3,4,5,6,7,8,9,10
     * k=3
     * ans=3,4,5,6,7,8,9,10
     */
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.idx = idx;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            // ascending
            // return this.val-o.val;
            // descending
            return o.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;// window size
        int res[] = new int[arr.length - k + 1];// n-k+1

        PriorityQueue<Pair> q = new PriorityQueue<Pair>();

        // 1st window
        for (int i = 0; i < k; i++) {
            q.add(new Pair(arr[i], i));
        }

        res[0] = q.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (q.size() > 0 && q.peek().idx <= (i - k)) {
                q.remove();
            }
            q.add(new Pair(arr[i], i));
            res[i - k + 1] = q.peek().val;
        }

        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }
}
