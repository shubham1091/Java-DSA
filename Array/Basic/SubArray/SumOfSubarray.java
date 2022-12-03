package Array.Basic.SubArray;

public class SumOfSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);
    }

    static void printSubarrays(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int check = inRange(arr, i, j);
                max = Math.max(max, check);
                min = Math.min(min, check);
            }
            System.out.println();
        }
        System.out.println("max is " + max + " and min is " + min);
    }

    static int inRange(int[] arr, int st, int en) {
        int tot = 0;
        System.out.print("[");
        for (int i = st; i <= en; i++) {
            tot += arr[i];
            if (i == en) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("] = " + tot);
        return tot;
    }

}
