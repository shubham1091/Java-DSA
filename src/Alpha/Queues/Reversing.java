package Alpha.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversing {
    /*
     * Reversing the first K elements of a queur
     * we have an integer K and a queue fo integers we need to reverse
     * the order of the first K elemtnts of the queue leaving the order
     * int the same relative order
     * input : [10, 20 ,30,40,50,60,70,80,90,100], K = 5
     * output :[50,40,30.20.10,60,70,80,90,100]
     */
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        Reverse(q, 5);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    private static void Reverse(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        while (!s.empty()) {
            q.add(s.pop());
        }
        int n = q.size() - k;
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
    }

}
