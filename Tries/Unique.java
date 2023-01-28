package Tries;

public class Unique extends Pre {
    /*
     * Count Unique Substrings
     * Given a string of length n of lowercase alphabet characters,
     * we need to count total number of distinct substrings of this strings.
     * str="ababa"
     * ans = 10
     */
    public static void main(String[] args) {
        String str = "apple";
        Pre tree = new Pre();

        // suffix -> insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            tree.insert(suffix);
        }

        System.out.println(countNode(root));
    }

    public static int countNode(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += countNode(node.children[i]);

            }
        }
        return count+1;
    }

}
