package BinaryTree;

public class Kth {
    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(node);
        level(root, 1, 3);
    }

    public static void level(Node root, int idx, int k) {
        if (root == null) {
            return;
        }
        if (idx == k) {
            System.out.print(root.data + " ");
            return;
        }
        level(root.left, idx + 1, k);
        level(root.right, idx + 1, k);

    }

}
