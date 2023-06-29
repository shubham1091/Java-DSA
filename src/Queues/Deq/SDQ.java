package Queues.Deq;

import java.util.Deque;
import java.util.LinkedList;

public class SDQ<E> {
    Deque<E> D = new LinkedList<E>();

    public boolean isEmpty() {
        return D.isEmpty();
    }

    public void push(E data) {
        D.addLast(data);
    }

    public E pop() {
        return D.removeLast();
    }

    public E peek() {
        return D.getLast();
    }
}
