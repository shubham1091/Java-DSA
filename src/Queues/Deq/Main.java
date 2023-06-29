package Queues.Deq;

import java.util.Deque;
import java.util.LinkedList;

//Double Ended Queue
public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first el = " + deque.getFirst());
        System.out.println("last el = " + deque.getLast());

        System.out.println("immplementation of stack using Deque");
        SDQ<Integer> stack = new SDQ<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();

        System.out.println("immplementation of Queue using Deque");
        QDQ<Integer> queue = new QDQ<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

}
