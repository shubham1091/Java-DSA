package BinaryTrees.BT;

public class Transform {
    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(node);
        sum(root);
        tree.levelorder(root);
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int l = sum(root.left);
        int r = sum(root.right);

        int rt = root.data + l + r;
        root.data = l + r;
        return rt;
    }
}
