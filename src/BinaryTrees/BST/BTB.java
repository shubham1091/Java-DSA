package BinaryTrees.BST;

import java.util.ArrayList;

public class BTB {
    // Convert BST to Balanced BST
    public static void main(String[] args) {
        int[] arr = { 8, 6, 5, 3, 10, 11, 12 };
        BS tree = new BS();
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = tree.insert(root, arr[i]);
        }
        tree.lavelOrder(root);
        System.out.println();
        root = arrange(root);
        tree.lavelOrder(root);
    }

    public static Node arrange(Node root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        order(root, result);
        root = Balence(result, 0, result.size() - 1);
        return root;
    }

    public static void order(Node root, ArrayList<Integer> ls) {
        if (root == null) {
            return;
        }
        order(root.left, ls);
        ls.add(root.data);
        order(root.right, ls);
    }

    public static Node Balence(ArrayList<Integer> ls, int st, int en) {
        if (st > en) {
            return null;
        }
        int mid = st + (en - st) / 2;
        Node temp = new Node(ls.get(mid));
        temp.left = Balence(ls, st, mid - 1);
        temp.right = Balence(ls, mid + 1, en);
        return temp;
    }

}
