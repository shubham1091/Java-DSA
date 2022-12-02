package Stacks;

public class SList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;

    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peak() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

}
