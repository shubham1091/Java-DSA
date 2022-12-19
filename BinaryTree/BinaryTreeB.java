package BinaryTree;

public class BinaryTreeB {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 7, -1, 8, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.total(root));
        System.out.println(tree.diameterA(root));
        System.out.println(tree.diameterB(root).diameter);
    }
}