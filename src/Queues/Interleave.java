package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    /*
     * Interleave 2 halves of a queue (even length)
     * input : 1 2 3 4 5 6 7 8 9 10
     * outupu : 1 6 2 7 3 8 4 9 5 10
     */

    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }
        mix(a);
        while (!a.isEmpty()) {
            System.out.print(a.remove() + " ");
        }
        System.out.println();

    }

    public static void mix(Queue<Integer> q) {
        int sz = q.size();
        Queue<Integer> res = new LinkedList<Integer>();
        for (int i = 0; i < sz / 2; i++) {
            res.add(q.remove());
        }
        while (!res.isEmpty()) {
            q.add(res.remove());
            q.add(q.remove());
        }
    }

}
