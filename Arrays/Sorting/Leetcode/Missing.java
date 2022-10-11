package Arrays.Sorting.Leetcode;

public class Missing {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4 };
        System.out.println(MissingNumber(arr));
    }

    // leet code 268
    static int MissingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // case 2
        return arr.length;
    }

    static void swap(int[] x, int i, int y) {
        int temp = x[i];
        x[i] = x[y];
        x[y] = temp;
    }
}
