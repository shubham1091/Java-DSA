package Heaps;

import java.util.Arrays;

public class Sort {
    public static void heapSort(int[] arr, boolean inc) {
        // step1 - build maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(i, n, arr, inc);
        }
        // step2 - push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i, arr, inc);
        }
    }

    public static void heapify(int i, int size, int[] arr, boolean inc) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (inc) {
            if (left < size && arr[left] > arr[maxIdx])
                maxIdx = left;
        } else {
            if (left < size && arr[left] < arr[maxIdx])
                maxIdx = left;
        }
        if (inc) {
            if (right < size && arr[right] > arr[maxIdx])
                maxIdx = right;
        } else {
            if (right < size && arr[right] < arr[maxIdx])
                maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, size, arr, inc);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3 };
        System.out.println(Arrays.toString(arr));
        heapSort(arr, true);

        System.out.println(Arrays.toString(arr));
    }

}
