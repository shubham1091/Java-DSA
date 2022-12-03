package Arrays.Searching.Linear;

public class Lin {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);

    }

    // Search in the array : return the index if item found
    // outerwise if item not found return -1
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            if (arr[i] == target) {
                return i;
            }
        }
        // this line will execute if none of the return ststement above is executed
        // hanse the target not found
        return -1;
    }
    // return the item if exist

    static int val(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE
            ;
        }
        // enhanced for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return ststement above is executed
        // hanse the target not found
        return Integer.MAX_VALUE
        ;
    }

}
