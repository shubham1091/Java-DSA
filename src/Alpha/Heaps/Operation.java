package Alpha.Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Operation {
    /*
     * Minimum operations to halve Array sum
     * we have an array arr[], the task is to find out the minimum number of
     * operations to make the sum of array elements lesser or equal to half of its
     * initial value. in one such operation, it is allowed to half the value of any
     * array element
     * input:
     * [1,5,8,19]
     * output:
     * 3
     */
    static int minops(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            q.add(-nums.get(i));
        }
        double temp = sum;
        int cnt = 0;
        while (temp > sum / 2) {
            int x = -q.peek();
            q.remove();
            temp -= Math.ceil(x * 1.0 / 2);
            q.add(x/2);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(List.of(4, 6, 3, 9, 10, 2));
        int count = minops(nums);
        System.out.println(count);
    }
}
