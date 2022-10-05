package Arrays.Searching.Binary.Matrix;

import java.util.Arrays;

public class Table {
    //matrix is sorted in row and columnn wise maner
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(search(arr, 50)));

    }

    static int[] search(int[][] arr, int targt) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == targt) {
                return new int[] { row, col };
            }
            if (arr[row][col] < targt) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

}
