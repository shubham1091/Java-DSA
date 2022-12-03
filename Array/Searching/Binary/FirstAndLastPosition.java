package Array.Searching.Binary;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int [] ans =occurrences(arr, 7);
        System.out.println("["+ans[0]+" , "+ans[1]+"]");

    }
    //leet code Q 34
    static int[] occurrences(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }

    static int search(int[] arr, int target, boolean con) {
        int ans = -1;
        int st = 0;
        int en = arr.length - 1;
        while (st <= en) {
            int mid = (st + en) / 2;
            if (arr[mid] == target) {
                ans=mid;
                if (con) {
                    en = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else if (arr[mid] > target) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return ans;
    }

}
