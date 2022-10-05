package Arrays.Searching.LInear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(Range(arr, 1, 4, 14));

    }

    static boolean Range(int[] arr, int idx1, int idx2, int target) {
        if (arr.length == 0 || idx1 > idx2 || idx1 >= arr.length || idx2 >= arr.length) {
            return false;
        }
        for (int i = idx1; i <= idx2; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

}
