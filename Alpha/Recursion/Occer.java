package Alpha.Recursion;

public class Occer {
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
