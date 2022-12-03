package Array.Basic;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        input(mat);
        output(mat);
    }

    static void input(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void output(int[][] arr) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;
        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            // bouutom
            for (int j = ec - 1; j >= sc; j--) {
                System.out.print(arr[er][j] + " ");
            }
            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(arr[i][sc] + " ");
            }
            sc++;
            sr++;
            ec--;
            er--;

        }
    }

}
