package Recursion;

public class Check {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 55 };
        System.out.println(Sorted(arr, 0, arr.length - 1));
    }

    static boolean Sorted(int[] arr, int st, int en) {
        if (st >= en) {
            return true;
        }
        int mid = st + (en - st) / 2;
        if (arr[mid] >= arr[st] && arr[mid] <= arr[en]) {
            boolean left = Sorted(arr, st, mid - 1);
            boolean right = Sorted(arr, mid + 1, en);
            if (left && right) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

}
