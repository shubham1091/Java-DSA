package Alpha.LList;

public class OddEven {
    /*
     * Odd Even Linked list
     * We have a linked list of integers, write a function to modify the linked
     * list such that all even numbers appear before all the odd numbers in
     * modifyed linked list. Also, keep the order of even and odd numbers same
     */

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        OddEven list = new OddEven();
        list.push(6);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(8);
        System.out.println("linked list");
        list.printList();
        list.segregateEvenOdd();
        System.out.println("updated linked list");
        list.printList();
    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null) {
            end = end.next;
        }
        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
