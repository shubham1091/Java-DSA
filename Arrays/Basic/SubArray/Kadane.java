package Arrays.Basic.SubArray;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        sum(arr);
    }

    static void sum(int[] arr) {
        int crrSum = 0;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            crrSum += arr[i];
            if (crrSum <= 0) {
                crrSum = 0;
            } else {
                mx = Math.max(mx, crrSum);
            }
        }
        System.out.println("max is " + mx);
    }
}
