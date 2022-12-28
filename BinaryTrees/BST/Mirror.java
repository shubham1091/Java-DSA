package BinaryTrees.BST;

public class Mirror {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 6, 10, 11 };
        BS tree = new BS();
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = tree.insert(root, arr[i]);
        }
        tree.lavelOrder(root);
        work(root);
        tree.lavelOrder(root);

    }

    public static Node work(Node root) {
        if (root == null) {
            return null;
        }
        Node L = work(root.left);
        Node R = work(root.right);
        root.left = R;
        root.right = L;
        return root;
    }
}
