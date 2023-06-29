package Array.Sorting;

import java.util.Arrays;
//Bubble sort
public class BSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            // for each step, max item will come at the last respective index
            for (int j = 0; j < arr.length - (1 + i); j++) {
                // swap if the item is smaller then the previous item
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = false;
                }
            }
            // if you did not wwap for a particular value of i, it means the array is sorted
            // hence stop
            if (check) {
                return;
            }
        }
    }

}
