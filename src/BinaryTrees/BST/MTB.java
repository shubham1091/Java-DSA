package BinaryTrees.BST;

import java.util.ArrayList;

public class MTB {
    // merge two bst
    public static void main(String[] args) {
        int[] a = { 9, 3, 12 };
        int[] b = { 2, 1, 4 };
        BS tree = new BS();
        Node r1 = null;
        for (int i = 0; i < a.length; i++) {
            r1 = tree.insert(r1, a[i]);
        }
        Node r2 = null;
        for (int i = 0; i < b.length; i++) {
            r2 = tree.insert(r2, b[i]);
        }
        Node root = merge(r1, r2);
        tree.inorder(root);
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node merge(Node r1, Node r2) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        getInorder(r1, a1);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        getInorder(r2, a2);

        int i = 0, j = 0;
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        while (i < a1.size() && j < a2.size()) {
            if (a1.get(i) <= a2.get(j)) {
                a3.add(a1.get(i));
                i++;
            } else {
                a3.add(a2.get(j));
                j++;
            }
        }
        while (i < a1.size()) {
            a3.add(a1.get(i));
            i++;
        }
        while (j < a2.size()) {
            a3.add(a2.get(j));
            j++;
        }
        return create(a3, 0, a3.size() - 1);
    }

    public static Node create(ArrayList<Integer> arr, int st, int en) {
        if (st > en) {
            return null;
        }
        int mid = st + (en - st) / 2;
        Node temp = new Node(arr.get(mid));
        temp.left = create(arr, st, mid - 1);
        temp.right = create(arr, mid + 1, en);
        return temp;
    }
}
