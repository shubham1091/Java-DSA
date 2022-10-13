package Alpha.Array;

public class Duplicate {
    /* 
     * Given an integer array nums, return true if any value appears ar least twice in the array, and return false if every element is distinct.
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 5, 5 };
        if (!copy(arr)) {
            System.out.println("no duplicate elements");
        } else {
            System.out.println("duplicate elements");
        }
    }

    static boolean copy(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
