package Queues.Deq;

import java.util.Deque;
import java.util.LinkedList;

public class QDQ<E> {
    Deque<E> Q = new LinkedList<E>();

    public boolean isEmpty() {
        return Q.isEmpty();
    }

    public void add(E data) {
        Q.addLast(data);
    }

    public E remove() {
        return Q.removeFirst();
    }

    public E peek() {
        return Q.peekFirst();
    }
}
