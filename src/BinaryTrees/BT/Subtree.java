package BinaryTrees.BT;


public class Subtree {
    /*
     * Subtree of another tree
     * given the roots ot two binary trees root and subroot return true
     * if there is a subtree of root with the same structure and node
     * values of subroot and false
     */
    public static void main(String[] args) {
        int[] m = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        int[] s = { 2, 4, -1, -1, 5, -1, 2, -1, -1 };
        Btree tree = new Btree();
        Btree subtree = new Btree();
        Node r1 = tree.buildTree(m);
        Node r2 = subtree.buildTree(s);
        tree.levelorder(r1);
        System.out.println();
        subtree.levelorder(r2);

        System.out.println(isSubtree(r1, r2));
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;

    }

}
