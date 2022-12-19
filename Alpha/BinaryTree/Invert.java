package Alpha.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Invert {
    /*
     * Invert Bnary tree
     * Mirror of a tree: Mirror of a binary tree T is another
     * Binary Tree M(T) with left and right children of all
     * non-leaf nodes interchanged
     */
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Mirror(root);
        order(root);
    }

    public static Node Mirror(Node root) {
        if (root == null) {
            return root;
        }
        Node l = Mirror(root.left);
        Node r = Mirror(root.right);
        root.left = r;
        root.right = l;
        return root;
    }

    public static void order(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node crr = q.remove();
            if(crr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(crr.data+" ");
                if(crr.left!=null){
                    q.add(crr.left);
                }
                if(crr.right!=null){
                    q.add(crr.right);
                }
            }

        }
    }
}
