package Alpha.Greedy;

public class Split {
    /*
     * Split the given array into K sub-array
     * we have an array[] of N elements and number K (1<=K<=N)
     * Split the given array into K subarrays (they must cover all the elements)
     * the maximum subarray sum achievable out of K subarrays
     * fromed must be the minimum possible find that possible
     * subarray sum
     * input = array[]={1,1,2},K=2
     * output = 2
     */
    public static int ans = 10000000;

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        int k = 2;
        int n = arr.length;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);
    }

    private static void solve(int[] a, int n, int k, int idx, int sum, int mx) {
        if (k == 1) {
            mx = Math.max(mx, sum);
            sum = 0;
            for (int i = idx; i < n; i++) {
                sum += a[i];
            }
            mx = Math.max(mx, sum);
            ans = Math.min(ans, mx);
            return;
        }
        sum = 0;
        for (int i = idx; i < n; i++) {
            sum += a[i];
            mx = Math.max(mx, sum);
            solve(a, n, k - 1, i + i, sum, mx);
        }
    }

}
