package Tries;

public class Break {
    /*
     * Word Break problem
     * Given an input string and a dictionary of words,
     * find out if the input string can be broken into
     * a space-separated sequence of dictionary words.
     * words[]={i,like,sam,samsung,mobile,ice};
     * key="ilikesamsung"
     * output=true
     */
    static Pre tree = new Pre();

    public static void main(String[] args) {
        String[] arr = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (String i : arr) {
            tree.insert(i);
        }
        String key = "ilikesamsun  g";
        System.out.println(wordBreak(key));

    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (tree.search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }
}
