package BitWise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int n = 0;
        for (int i : arr) {
            n ^= i;
        }
        return n;
    }

}
