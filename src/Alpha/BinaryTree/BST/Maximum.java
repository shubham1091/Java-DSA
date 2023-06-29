package Alpha.BinaryTree.BST;

public class Maximum {
    /*
     * Maximum sum BST in Binary Tree
     * We have a binary tree, task is to print
     * the maximum sum on nodes of a sub-tree
     * which is also a Binary Search Tree
     */
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int max;
        int min;
        boolean isBst;
        int sum;
        int currmax;

        Info(int max, int min, boolean isBst, int sum, int currmax) {
            this.max = max;
            this.min = min;
            this.isBst = isBst;
            this.sum = sum;
            this.currmax = currmax;
        }

        Info() {

        }
    };

    static class INT {
        int a;
    }

    static Info MaxSumBSTUtil(Node root, INT maxsum) {
        if (root == null) {
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);
        }

        if (root.left == null && root.right == null) {
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }

        Info L = MaxSumBSTUtil(root.left, maxsum);
        Info R = MaxSumBSTUtil(root.right, maxsum);

        Info BST = new Info();
        if (L.isBst && R.isBst & L.max < root.data && R.min > root.data) {
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(R.min, L.min));

            maxsum.a = Math.max(maxsum.a, R.sum + root.data + L.sum);
            BST.sum = R.sum + root.data + L.sum;
            BST.currmax = maxsum.a;
            BST.isBst = true;
            return BST;
        }
        BST.isBst = false;
        BST.currmax = maxsum.a;
        BST.sum = R.sum + root.data + L.sum;
        return BST;

    }

    static int MaxSumBST(Node root) {
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return MaxSumBSTUtil(root, maxsum).currmax;
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);
        System.out.println(MaxSumBST(root));
    }
}
