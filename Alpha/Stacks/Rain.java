package Alpha.Stacks;

import java.util.Stack;

public class Rain {
    /*
     * Trapping Rain water
     * we have an array of N non-negative integers arr[] representing an
     * elevation map there the width of each bar is 1, compute how much water
     * it is aable to tarap after raining.
     * Note we have already solved this question using arrays but you have to
     * now solve this using Stack.
     * sample input [7,0,4,2,5,0,6,4,0,6]
     * sample output 27
     */
    public static void main(String[] args) {
        int[] arr = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        System.out.println(maxWater(arr));
    }

    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
                int pop_height = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;
                ans += distance * min_height;
            }
            stack.push(i);
        }
        return ans;
    }

}
