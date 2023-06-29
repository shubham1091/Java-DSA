package Array.Searching.LInear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(findNumber(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // leetcode Q no. 1295
    static int findNumber(int[] arr) {
        int count = 0;
        for (int ac : arr) {
            int check = ac;
            int num = 0;

            while (check != 0) {
                check /= 10;
                num++;
            }

            // if (check < 0) {
            // check *= -1;
            // }
            // num = (int) (Math.log10(check)) + 1;
            if (num % 2 == 0) {
                count++;

            }
        }
        return count;
    }

}