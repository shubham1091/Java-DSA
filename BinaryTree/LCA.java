package BinaryTree;

import java.util.ArrayList;

public class LCA {
    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(node);
        System.out.println(lca1(root, 4, 7).data);
        System.out.println(lca2(root, 4, 7).data);
    }

    public static Node lca1(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }
        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node l = lca2(root.left, n1, n2);
        Node r = lca2(root.right, n1, n2);

        if (r == null) {
            return l;
        }
        if (l == null) {
            return r;
        }
        return root;
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean lef = getPath(root.left, n, path);
        boolean rig = getPath(root.right, n, path);
        if (lef || rig) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
