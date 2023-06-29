package Alpha.BinaryTree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Range {
    /*
     * Range sum of bst
     * we have a binary search tree consisting of N nodes
     * and two positive integers L and R, the task is to
     * find the sum of values of all the nodes that lie
     * in the range [L,R]
     */
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);
        sum(root, 7, 15);
        System.out.println(rangeSum(root, 7, 15));
    }

    public static void sum(Node root, int L, int R) {
        int sum = Helper(root, L, R);
        System.out.println(sum);
    }

    public static int Helper(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sm = 0;
        if (root.data >= L && root.data <= R) {
            sm += root.data;
        }
        sm += Helper(root.left, L, R);
        sm += Helper(root.right, L, R);
        return sm;
    }

    static int rangeSum(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node crr = q.remove();
            if (crr.data >= L && crr.data <= R) {
                sum += crr.data;
            }
            if (crr.left != null && crr.data > L) {
                q.add(crr.left);
            }
            if (crr.right != null && crr.data < R) {
                q.add(crr.right);
            }
        }
        return sum;
    }

}
