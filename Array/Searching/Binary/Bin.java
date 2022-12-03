package Array.Searching.Binary;

public class Bin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println(biSearch(arr, 19));
    }

    static int biSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int st = 0;
        int en = arr.length - 1;

        while (st <= en) {
            // int mid = (st + en) / 2;//might be possible that (st+en) exceeds the range of
            // int
            int mid = st + (en - st) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }

        }
        return -1;
    }
}
