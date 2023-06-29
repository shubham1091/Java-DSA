package BinaryTrees.BST;

public class ATB {
    // Sorted array to balanced bst
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
        BS tree = new BS();
        Node root = Balanced(arr, 0, arr.length - 1);
        tree.lavelOrder(root);
    }

    public static Node Balanced(int[] arr, int st, int en) {
        if (st > en) {
            return null;
        }
        int mid = st + (en - st) / 2;
        Node root = new Node(arr[mid]);
        root.left = Balanced(arr, st, mid - 1);
        root.right = Balanced(arr, mid + 1, en);
        return root;
    }

}
