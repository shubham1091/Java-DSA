package Arrays.Basic.SubArray;

public class Subarrays {
    // a continuous part of array
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);

    }

    static void printSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                inRange(arr, i, j);
            }
            System.out.println();
        }
    }

    static void inRange(int[] arr, int st, int en) {
        System.out.print("[");
        for (int i = st; i <= en; i++) {
            if (i == en) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]  ");
    }
}
