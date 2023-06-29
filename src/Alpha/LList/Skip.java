package Alpha.LList;

public class Skip {
    /*
     * Delete N node After M Nodes of a linked list
     * we have alinked list and two integers M and N. Traverse the linked list
     * such that you retain M Node then delete Next N Nodes. continue the
     * same till end of the linked list.
     * Difficulty level: Rookie.
     */
    static class Node {
        int data;
        Node next;

    };

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    static void delete(Node head, int M, int N) {
        Node crr = head, t;

        int count;
        while (crr != null) {
            for (count = 1; count < M && crr != null; count++) {
                crr = crr.next;
            }
            if (crr == null) {
                return;
            }
            t = crr.next;
            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
            }
            crr.next = t;
            crr = t;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 3;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        System.out.printf("M = %d ,N =%d \n" + "Linked list we have is:\n", M, N);
        printList(head);
        delete(head, M, N);
        System.out.print("Linked list on deletion is :\n");
        printList(head);
    }

}
