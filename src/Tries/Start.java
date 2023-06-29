package Tries;

public class Start extends Pre {
    /* 
     * StartsWith Problem 
     * Create a function boolean startsWith(String prefix) for a trie. 
     * Return true if there is a previously inserted string word that 
     * has the prefix otherwise.
     * word[] = {"apple","app","mango","man","woman"}
     * prefix ="app" output= true
     * prefix = "moon" output= false
     */
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        Pre tree = new Pre();
        for(int i=0;i<words.length;i++){
            tree.insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));


    }
}
