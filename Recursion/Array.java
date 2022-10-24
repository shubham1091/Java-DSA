package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    static ArrayList<Integer> List = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 7, 4, 8, 6 };
        System.out.println("isAscending  " + isAscending(arr, 0));
        System.out.println("LiSearch  " + LiSearch(arr, 0, 5));
        occurrences(arr, 0, 4);
        System.out.println(List);

        int[] adc = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubble(adc, adc.length-1, 0);
        System.out.println(Arrays.toString(adc));
    }

    static boolean isAscending(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        } else if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return true && isAscending(arr, idx + 1);
    }

    static int BiSearch(int[] arr, int st, int en, int target) {
        if (st >= en) {
            return -1;
        }
        int mid = st + (en - st) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BiSearch(arr, st, mid - 1, target);
        } else {
            return BiSearch(arr, mid + 1, en, target);
        }
    }

    static int LiSearch(int[] arr, int idx, int tar) {
        if (idx == arr.length) {
            return -1;
        } else if (arr[idx] == tar) {
            return idx;
        }
        return LiSearch(arr, idx + 1, tar);
    }

    static void occurrences(int[] arr, int idx, int tar) {
        if (idx == arr.length) {
            return;
        } else if (arr[idx] == tar) {
            List.add(idx);
        }
        occurrences(arr, idx + 1, tar);
    }

    static void bubble(int[] arr, int itr, int itc) {
        if (itr == 0 ) {
            return;
        }
        if (itr > itc) {
            if (arr[itc] > arr[itc + 1]) {
                int temp = arr[itc];
                arr[itc] = arr[itc + 1];
                arr[itc + 1] = temp;
            }
            bubble(arr, itr, ++itc);
        } else {
            bubble(arr, --itr, 0);
        }
    }
}
