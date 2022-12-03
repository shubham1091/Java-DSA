package Arrays.Sorting;

import java.util.Arrays;

//Selection sort
public class Selection {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxidx = MaxIndex(arr, 0, last);
            swap(arr, maxidx, last);

        }
    }

    static int MaxIndex(int[] arr, int st, int en) {
        int max = st;
        for (int i = st; i < en; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
