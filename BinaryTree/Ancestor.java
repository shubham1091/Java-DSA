package BinaryTree;

public class Ancestor {
    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(node);
        KAncestor(root, 4, 1);
    }

    public static int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int l = KAncestor(root.left, n, k);
        int r = KAncestor(root.right, n, k);

        if (l == -1 && r == -1) {
            return -1;
        }

        int mx = Math.max(l, r);

        if (mx + 1 == k) {
            System.out.println(root.data);
        }
        return mx + 1;

    }

}
