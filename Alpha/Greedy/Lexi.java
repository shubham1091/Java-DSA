package Alpha.Greedy;

import java.util.Arrays;

public class Lexi {
    /*
     * Lexicographically smallest string of length N and sum K
     * we have tow integers N and K the task is to print the
     * lexicographically smallest string of length N consisting
     * of lower-case english alphabets such that the sum of the
     * cahracters of the string equals to K where 'a'=1,'b'=2 and 'z'=26
     * input = N=5 K=42
     * output = aaamz
     */
    public static void main(String[] args) {
        int n = 5, k = 42;
        char arr[] = lexo_small(n, k);
        System.out.println(new String(arr));
    }

    private static char[] lexo_small(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for (int i = n - 1; i >= 0; i--) {
            k -= i;
            if (k >= 0) {
                if (k >= 26) {
                    arr[i] = 'z';
                    k -= 26;
                } else {
                    arr[i] = (char) (k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            } else {
                break;
            }
            k += i;
        }
        return arr;
    }

}
