package BinaryTrees.BT;


import java.util.LinkedList;
import java.util.Queue;

public class Btree {
    int idx = -1;

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node crr = q.remove();
            if (crr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(crr.data + " ");
                if (crr.left != null) {
                    q.add(crr.left);
                }
                if (crr.right != null) {
                    q.add(crr.right);
                }
            }
        }
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    public int count(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public int total(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + total(root.left) + total(root.right);
    }

    public int diameterA(Node root) {// O(n^2)
        if (root == null) {
            return 0;
        }
        int l = diameterA(root.left);
        int lH = height(root.left);
        int r = diameterA(root.right);
        int rH = height(root.right);

        int self = lH + rH + 1;
        return Math.max(self, Math.max(l, r));
    }

    static class Info {
        int diameter;
        int h;

        public Info(int diameter, int h) {
            this.diameter = diameter;
            this.h = h;
        }
    }

    public Info diameterB(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info l = diameterB(root.left);
        Info r = diameterB(root.right);

        int diam = Math.max(Math.max(l.diameter, r.diameter), l.h + r.h + 1);
        int ht = Math.max(l.h, r.h) + 1;

        return new Info(diam, ht);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
