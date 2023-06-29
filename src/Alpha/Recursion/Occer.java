package Alpha.Recursion;

public class Occer {
    /*
     * For a given integer array of size N. You have to find all the occurrences
     * (indices) of a given element (key) and print them. Use a recursive funntion
     * to solve this problem
     * SAMPLE INPUT : arr[] ={3,2,4,6,5,2,8,2,2}, key = 2
     * SAMPLE OUTPUT: 1 5 7 8
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int target = 2;
        Occerences(arr, 0, target);
        System.out.println();
    }

    static void Occerences(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        Occerences(arr, ++idx, key);
    }

}
