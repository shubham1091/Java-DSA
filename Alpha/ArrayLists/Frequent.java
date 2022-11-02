package Alpha.ArrayLists;

import java.util.ArrayList;

public class Frequent {
    /*
     * Most Frequent number followint key
     * You are given an integer arraylist nums.you are also given an integer key,
     * which is
     * present in nums.
     * For every unique integer target in nums, count the number of times target
     * immediately
     * follows an occurrence of key in nums. in other words, count the number of
     * indices i such
     * that.
     * 0<=i<=nums.size()-2,
     * nums.get(i)==key and,
     * nums.get(i+1)==target.
     * retrun the target with the maximum count
     * (Assumption- that the target with maximum count is unique.)
     * Sample Input :nums = [1,100,200,1,100], key = 1
     * Sample Output : 100
     * Explanation :For target = 100, there are 2 occurrences at indices 1 and 4
     * which follow an occurrence of key.No other integers follow an occurrence of
     * key,so we return 100
     * 
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(occurrences(list, 1));
    }

    static int occurrences(ArrayList<Integer> ls, int key) {
        int[] result = new int[1000];
        for (int i = 0; i < ls.size() - 1; i++) {
            if (ls.get(i) == key) {
                result[ls.get(i + 1) - 1]++;
            }

        }
        int mx = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > mx) {
                mx = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }
}