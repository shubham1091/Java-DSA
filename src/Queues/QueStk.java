package Queues;

import java.util.Stack;

public class QueStk {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public boolean isEmt() {
        return s1.isEmpty();
    }

    public void push(int data) {// O(n)
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int remove() {// O(1)
        if (isEmt()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    public int pek() {// O(1)
        if (isEmt()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
}
