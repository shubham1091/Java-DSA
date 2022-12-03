package Array.Searching.Binary;

//Order agonstic binary search
public class Agnostic {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.println(Search(arr, 12));

    }

    static int Search(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;
        boolean check = arr[st] < arr[en];
        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (check) {
                if (arr[mid] < target) {
                    st = mid + 1;
                } else {
                    en = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    st = mid + 1;
                } else {
                    en = mid - 1;
                }
            }
        }
        return -1;
    }
}
