package BinaryTrees.BST;

import java.util.ArrayList;

public class Paths {
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11, 14 };
        BS tree = new BS();
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }
        Root2Leaf(root, new ArrayList<Integer>());
    }

    public static void Root2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        Root2Leaf(root.left, path);
        Root2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
}
