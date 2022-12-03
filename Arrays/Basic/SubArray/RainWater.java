package Arrays.Basic.SubArray;

public class RainWater {
    /*
     * Given n non=negative integers representing an elevation
     * map where the width of each bar is 1, compute how much
     * water it can trap after raining.
     * ------------------------
     * ......|-|
     * ......|-|...|-|
     * |-|...|-|...|-|
     * |-|...|-|-|.|-|
     * |-|-|.|-|-|-|-|
     * |-|-|.|-|-|-|-|
     * -------------------------
     * 
     */
    public static void main(String[] args) {
        int[] hight = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(water(hight));
    }

    static int water(int[] arr) {
        int n = arr.length;
        // calculate left max boundary - array
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        // calculate right max boundary - array
        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int trapped = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLavel = min (leftMax bound,rightmax bound)
            int waterLeverl = Math.min(left[i], right[i]);
            // trapped water = waterLevel -hight[i]
            trapped += waterLeverl - arr[i];
        }
        return trapped;

    }

}
