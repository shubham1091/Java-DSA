package Arrays.Searching.LInear;

import java.util.Arrays;

public class In2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int[][] acc = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)) + "  target= " + target);
        System.out.println(max(arr) + "  using max method");
        System.out.println(FindMax(arr) + "  using FindMax method");
        System.out.println(Wealth(acc));

    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > mx) {
                    mx = arr[i][j];
                }
            }
        }
        return mx;
    }

    static int FindMax(int[][] arr) {
        int mx = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int col : row) {
                if (col > mx) {
                    mx = col;
                }
            }
        }
        return mx;
    }
    //leetcode Q no. 1672
    static int Wealth(int[][] arr) {
        int mx = Integer.MIN_VALUE;
        for (int[] row : arr) {
            int check = 0;
            for (int col : row) {
                check += col;
            }
            if (check > mx) {
                mx = check;
            }
        }
        return mx;
    }
}