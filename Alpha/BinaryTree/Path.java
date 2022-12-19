package Alpha.BinaryTree;

public class Path {
    /*
     * Maximum path sum in binary tree
     * we have a binary tree find the maximum path sum
     * the path may start and end at any node in the tree
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
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(high(root));
    }

    public static int high(Node root) {
        if (root == null) {
            return 0;
        }
        int l = high(root.left);
        int r = high(root.right);
        int tot = root.data + l + r;
        if (tot < l + r) {
            if (l > r) {
                return l;
            } else {
                return r;
            }
        }
        return tot;
    }
}
