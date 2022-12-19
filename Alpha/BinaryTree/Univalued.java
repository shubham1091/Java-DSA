package Alpha.BinaryTree;

public class Univalued {
    /*
     * check if a binary tree is univalued or not
     * we have a binary tree, the task is to check if the binary tree
     * is univalued or not. if found to true, then print "YES" otherwise
     * print "NO"
     */
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);
        if(valid(root)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    public static boolean valid(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return valid(root.left) && valid(root.right);

    }
}
