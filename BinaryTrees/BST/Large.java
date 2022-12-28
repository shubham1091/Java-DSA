package BinaryTrees.BST;

public class Large {
    // size of largest bst in bt
    static int maxBST = 0;

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }

        @Override
        public String toString() {
            // return super.toString();
            return isBST + " " + size + " " + min + " " + max;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        System.out.println(large(root));
        System.out.println("largest BST size = " + maxBST);
    }

    public static Info large(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info L = large(root.left);
        Info R = large(root.right);

        int sz = L.size + R.size + 1;
        int mi = Math.min(root.data, Math.min(L.min, R.min));
        int mx = Math.max(root.data, Math.max(L.max, R.max));

        if (root.data <= L.max || root.data >= R.min) {
            return new Info(false, sz, mi, mx);
        }
        if (L.isBST && R.isBST) {
            maxBST = Math.max(maxBST, sz);
            return new Info(true, sz, mi, mx);
        }
        return new Info(false, sz, mi, mx);

    }

}
