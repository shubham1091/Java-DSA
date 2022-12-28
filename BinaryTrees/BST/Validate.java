package BinaryTrees.BST;

public class Validate {
    public static void main(String[] args) {
        int[] v1 = { 1, 1, 1 };
        int[] v2 = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        BS tree = new BS();
        Node r1 = null;
        Node r2 = null;
        for (int i = 0; i < v1.length; i++) {
            r1 = tree.insert(r1, v1[i]);
        }
        for (int i = 0; i < v2.length; i++) {
            r2 = tree.insert(r2, v2[i]);
        }
        System.out.println(isValid(r1, null, null));
        tree.inorder(r1);
        System.out.println();
        System.out.println(isValid(r2, null, null));
        tree.inorder(r2);
    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
}
