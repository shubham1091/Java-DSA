package Recursion;

public class Bin {
    //Binary search using recursive function
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(arr, 0, arr.length, 6));
    }

    static int search(int[] arr, int st, int en, int target) {
        if (st >= en) {
            return -1;
        }
        int mid = st + (en - st) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, st, mid - 1, target);
        } else {
            return search(arr, mid + 1, en, target);
        }
    }

}
