package Stacks;

import java.util.Stack;

public class NextGreater {
    /*
     * The next geater element of some elemtne x in an array
     * is the first greater element that is to the right of x in the same array.
     * arr = [6, 8, 0, 1, 3]
     * nextGreater = [8,-1, 1, 3, -1]
     */
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] grr = new int[arr.length];
        NextGrr(arr, grr);
        for (int i : grr) {
            System.out.print(i + " ");
        }
    }

    private static void NextGrr(int[] arr, int[] grr) {// O(n)
        Stack<Integer> s = new Stack<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                grr[i] = -1;
            } else {
                grr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return;
    }
}
