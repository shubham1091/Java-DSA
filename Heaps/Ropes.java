package Heaps;

import java.util.PriorityQueue;

public class Ropes {
    /*
     * Connect N Ropes
     * Given are N ropes of different lengths, the task is to connect these
     * ropes into one rope with minimum cost, such that cost to connect two
     * ropes is equall to the sum of their lengths.
     * ropes = {4,3,2,6};
     * ans =29
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int[] lengths = { 2, 3, 3, 4, 6 };
        for (int i = 0; i < lengths.length; i++) {
            queue.add(lengths[i]);
        }
        int temp = 0;
        while (queue.size() > 1) {
            int m = queue.remove();
            int n = queue.remove();
            temp += m + n;
            queue.add(n + m);
        }
        System.out.println(temp);
    }
}
