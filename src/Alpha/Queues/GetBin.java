package Alpha.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class GetBin {
    /*
     * Generate Binary number
     * Given a number N the task is to generate and print all
     * binary numbers with decimal values from 1 to N.
     * input : 5
     * output : 1 10 11 100 101
     */
    public static void main(String[] args) {
        Queue<Integer> ls = new LinkedList<>();
        int N = 5;
        Bin(ls, N);
        while (!ls.isEmpty()) {
            System.out.print(ls.remove() + " ");
        }

    }

    private static void Bin(Queue<Integer> q, int N) {
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int size = N;
        for (int i = 0; i < size; i++) {
            String temp = Integer.toBinaryString(q.remove());
            q.add(Integer.parseInt(temp));
        }
    }

}