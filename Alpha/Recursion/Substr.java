package Alpha.Recursion;

public class Substr {
    /*
     * We are given a string S, we need to find the count of all contiguous
     * substrings starting and ending with the same character.
     * SAMPLE INPUT : S = "abcab"
     * SAMPLE OUTPUT :7
     * There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca,
     * bcab, c, ca, cab,a, ab, b Out of the above substrings,there are 7
     * substrings:a,abca,b,bcab,c,a and b.So, only 7 contiguous substrings start
     * and end with the same character.
     */
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(count(str, 0, n - 1, n));
    }

    static int count(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;

        }
        if (n <= 0) {
            return 0;
        }
        int res = count(str, i + 1, j, n - 1) + count(str, i, j - 1, n - 1) - count(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
}
