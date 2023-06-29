package Alpha.BinaryTree.BT;

public class Leaf {
    /*
     * Delete leaf nodes nith values as X
     * we have a binary tree and a targer integer x delete
     * all the leaf nodes haveing value as X also delete the
     * newly formed leaves with the target value as X
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

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right = new Node(3);
        root.right.left=new Node(5);
        root.right.right= new Node(3);
        preorder(root);
        System.out.println();
        rmv(root, 3);
        preorder(root);
    }

    public static boolean rmv(Node root, int x) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (root.data == x) {
                return true;
            } else {
                return false;
            }
        }
        boolean l = rmv(root.left, x);
        boolean r = rmv(root.right, x);
        if (l == true) {
            root.left = null;
        }
        if (r == true) {
            root.right = null;
        }
        return false;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
