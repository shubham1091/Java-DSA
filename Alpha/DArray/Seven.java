package Alpha.DArray;

public class Seven {
    /* 
     * print the number of 7's that are in the 2d array
     */
    public static void main(String[] args) {
        int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(count(arr, 7));

    }

    static int count(int[][] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

}
