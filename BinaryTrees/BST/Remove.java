package BinaryTrees.BST;

public class Remove {
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 7, 10, 11, 14 };
        BS tree = new BS();
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }
        tree.inorder(root);
        System.out.println();
        root = tree.delete(root, 5);
        // System.out.println();
        tree.inorder(root);
    }

}
