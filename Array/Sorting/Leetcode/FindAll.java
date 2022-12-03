package Array.Sorting.Leetcode;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(missing(arr));
    }

    // leetcode 448 & 442
    static ArrayList<Integer> missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[i] != arr[current] ) {
                swap(arr, i, current);
            } else {
                i++;
            }
        }
        // just find missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // ans.add(index + 1);
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
