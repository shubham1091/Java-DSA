package Queues;

public class QueList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int res = head.data;
        if (tail == head) {
            tail = head = null;
        } else {
            head = head.next;
        }
        return res;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }
}
