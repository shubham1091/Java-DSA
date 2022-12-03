package Array.Basic;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        /*
         * syntax
         * datatype [][] referenceVariable = new DataType [row size][col size];
         */
        // specifing the size of row is mandetory but difining the size of column in not
        // mandetory
        int[][] arr = new int[3][3];
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // example of different size of column it is known as jagged array
        int[][] diff = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // Input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output
        for (int row = 0; row < diff.length; row++) {
            for (int col = 0; col < diff[row].length; col++) {
                System.out.println(diff[row][col]);
            }
            System.out.println();
        }
        // or
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
        }
        // or
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        in.close();

    }

}
