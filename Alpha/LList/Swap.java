package Alpha.LList;

public class Swap {
    /*
     * Swapping Nodes in a Linked list
     * we have a linked list and two keys in it , swap nodes for two given keys.
     * Nodes should be swapped by changing links. swapping data of nodes may
     * be expensive in many situations when data dontais many dields. it may
     * be assumed that all keys in the linked list are distinct.
     */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        Swap list = new Swap();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.print("Linked list before ");
        list.printList();
        list.swap(4, 3);
        System.out.print("Linked list after ");
        list.printList();
    }

    public void swap(int x, int y) {
        if (x == y) {
            return;
        }
        Node prevX = null, crrX = head;
        while (crrX != null && crrX.data != x) {
            prevX = crrX;
            crrX = crrX.next;
        }
        Node prevY = null, crrY = head;
        while (crrY != null && crrY.data != y) {
            prevY = crrY;
            crrY = crrY.next;
        }
        if (crrX == null || crrY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = crrY;
        } else {
            head = crrY;
        }
        if (prevY != null) {
            prevY.next = crrX;
        } else {
            head = crrX;
        }
        Node temp = crrX.next;
        crrX.next = crrY.next;
        crrY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
