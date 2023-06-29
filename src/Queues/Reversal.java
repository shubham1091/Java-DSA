package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversal {
    /*
     * Queue Reversal
     * input : 1 2 3 4 5
     * output : 5 4 3 2 1
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        flip(queue);
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void flip(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.empty()) {
            q.add(s.pop());
        }
    }

}
