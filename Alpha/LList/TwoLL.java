package Alpha.LList;

public class TwoLL {
    /*
     * Intersection of two linked lists
     * In a system there are two singly linked list. By some programming error,
     * the end node of one of the linked list got linked to the second list,
     * forming an inverted Y-shaped list. write a program to get the point
     * where two linked list merge.
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        TwoLL list = new TwoLL();
        Node h1, h2;
        h1 = new Node(1);
        h2 = new Node(4);
        Node newNode = new Node(5);
        h2.next = newNode;
        newNode = new Node(6);
        h2.next.next = newNode;
        newNode = new Node(3);
        h1.next = newNode;
        h2.next.next.next = newNode;
        newNode = new Node(7);
        h1.next.next = newNode;
        h1.next.next.next = null;
        Node intersectionPoint = list.Ipoint(h2, h1);
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
    //time complexity O(M*N)
    public Node Ipoint(Node h1, Node h2) {
        //itterating through h2
        while (h2 != null) {
            //creating a temperary variable
            Node temp = h1;
            //itterating through h1
            while (temp != null) {
                if (temp == h2) {
                    return h2;
                }
                temp = temp.next;
            }
            h2 = h2.next;
        }
        return null;
    }

}
