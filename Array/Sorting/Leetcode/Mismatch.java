package Array.Sorting.Leetcode;

import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(find(arr)));
    }

    // leetcode 645
    static int[] find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1 ;
            if (arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int[] number = { -1, -1 };
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                number[0] = arr[idx];
                number[1] = idx + 1;

            }
        }
        return number; 

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
