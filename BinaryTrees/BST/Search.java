package BinaryTrees.BST;

public class Search {
    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        BS tree = new BS();
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }
        if(tree.search(root, 2)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }

    
}
