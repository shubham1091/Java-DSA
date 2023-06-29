package Array.Basic.SubArray;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        sum(arr);
    }

    static void sum(int[] arr) {
        int mx = Integer.MIN_VALUE;
        int currSum = 0;
        int[] prifix = new int[arr.length];
        prifix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prifix[j] : prifix[j] - prifix[i];
                mx = Math.max(mx, currSum);
            }
        }
        System.out.println("max sum is " + mx);
    }
}
