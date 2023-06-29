package Stacks;

import java.util.Stack;

public class Histogram {
    /*
     * Max area in histogram
     * Given an array of integers hights representing the histogram's bar
     * hight where the width of each bar is 1, return the area of the largest
     * rectangle in teh histogram.
     * hights = [2,1,5,6,2,3]
     */
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };// heights in histogram
        maxArea(arr);
    }

    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // Next smaller Right
        Stack<Integer> s = new Stack<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                // -1
                nsr[i] = arr.length;
            } else {
                // top
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                // -1
                nsl[i] = -1;
            } else {
                // top
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // current area
        for (int i = 0; i < arr.length; i++) {
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = hight * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram is " + maxArea);
    }

}
