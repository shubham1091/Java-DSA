package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Basic {
    // Priority Queue
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student(4, "A"));
        pq.add(new Student(5, "S"));
        pq.add(new Student(2, "D"));
        pq.add(new Student(6, "F"));
        pq.add(new Student(1, "G"));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }

        HP h = new HP();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove(); 
        }

    }

}
