package Alpha.Greedy;

public class Partition {
    /*
     * Maximum Balanced string partitions
     * we have a balanced string str of size N with an equal
     * number of L and R the task is to find a maximun number
     * X such that a given string can be partitioned intp x
     * balanced substring A string is called to be balanced
     * if the number of'Ls' in the string wquals the number
     * of 'Rs'
     * Input : "LRRRRLLRLLRL"
     * output : 3
     */
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.println(Balanced(str, n));
    }

    private static int Balanced(String str, int n) {
        if (n == 0) {
            return 0;
        }
        int r = 0, l = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (r == l) {
                ans++;
            }
        }
        return ans;
    }

}
