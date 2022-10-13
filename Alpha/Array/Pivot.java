package Alpha.Array;

public class Pivot {
    /*
     * Ther is an integer array nums sorted in ascending order (with distinct
     * values).Prior to being passed to your function, nums is possibly rotated at
     * an unknown pivot index k (1<=k<nums.length) such that the reaulting array is
     * [nums[k],nums[k+1],....,nums[n-1],nums[0],nums[1],...,nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
     * become[4,5,6,7,0,1,2].
     * Given the array nums after the possible rotaiton and an integer targer,
     * return the index of targer if it is in nums, or -1 if it is not in nums.
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {
        // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int[]nums={1};
        System.out.println(pivot(nums, 3));
    }

    static int pivot(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < arr.length - 1 && arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < arr[arr.length - 1]) {
                end = mid - 1;
            } else if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
