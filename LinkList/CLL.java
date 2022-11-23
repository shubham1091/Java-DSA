package LinkList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail = head;
            return;
        }
        do {
            Node temp = node.next;
            if (temp.val == val) {
                node.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node node = head;
        if (head != null) {
            System.out.print("Head -> ");
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("Head");
        }
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

    }

}
