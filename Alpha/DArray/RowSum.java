package Alpha.DArray;

public class RowSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(Rsum(arr, 1));
    }

    static int Rsum(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

}
