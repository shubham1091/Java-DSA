package Tries;

public class Pre {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (int idx = 0; idx < word.length(); idx++) {
            int ch = word.charAt(idx) - 'a';
            if (curr.children[ch] == null) {
                curr.children[ch] = new Node();
            }
            curr = curr.children[ch];
        }
        curr.eow = true;

    }

    public boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

}
