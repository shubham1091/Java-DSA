package Alpha.BinaryTree.BT;

import java.util.HashMap;

public class Duplicate {
    /*
     * Find all duplicate subtrees
     * we have a binary tree, find all duplicate subtrees
     * for each duplicate subtree, we only need to return
     * the root node of any one of them two trees are duplicates
     * if they have the same structure with the same node value
     */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashMap<String, Integer> m;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        printDups(root);
    }

    static String inorder(Node node) {
        if (node == null) {
            return "";
        }
        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        if (m.get(str) != null && m.get(str) == 1) {
            System.out.print(node.data + " ");
        }
        if (m.containsKey(str)) {
            m.put(str, m.get(str) + 1);
        } else {
            m.put(str, 1);
        }
        return str;
    }

    static void printDups(Node root) {
        m = new HashMap<>();
        inorder(root);
    }
}
