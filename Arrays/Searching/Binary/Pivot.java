package Arrays.Searching.Binary;

public class Pivot {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findPivot(arr));
    }

    static int Search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int ans = biSearch(nums, target, 0, pivot);
        if (ans == -1 && pivot != nums.length - 1) {
            ans = biSearch(nums, target, pivot + 1, nums.length - 1);
        }
        return ans;
    }
    
    // leet code 33
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[arr.length - 1]) {
                end = mid - 1;
            } else if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            }
        }
        return end;
    }

    static int biSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
