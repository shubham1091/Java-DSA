public class QueueLink {
    static Node head = null;
    static Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;

    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int res = head.val;
        if (tail == head) {
            tail = head = null;
        } else {
            head = head.next;
        }
        return res;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.val;
    }

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

}
