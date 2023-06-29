package LinkList;

public class DLL {
    private Node head;

    public DLL() {
        this.head = null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.pre = null;
        node.next = head;
        if (head != null) {
            head.pre = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        if (head == null) {
            node.pre = null;
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    public void insert(int val, int after) {
        Node temp = find(after);
        if (temp == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.pre = temp;
        if (node.next != null) {
            node.next.pre = node;
        }
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void Rev() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.value + " <=> ");
            temp = temp.pre;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node pre;

        public Node(int value) {
            this.value = value;
        }
    }

}
