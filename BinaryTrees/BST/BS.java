package BinaryTrees.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BS {
    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void lavelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(temp);
                }

            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public Boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1- leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2- single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 - both children
            Node IS = findInorder(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    private Node findInorder(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

class Node {
    Integer data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
