package Arrays.Basic.SubArray;

public class Pairs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        findPair(arr);

    }

    static void findPair(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + "," + arr[j] + "]  ");
            }
            System.out.println();
        }
    }

}
