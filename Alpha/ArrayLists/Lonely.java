package Alpha.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Lonely {
    /*
     * Lonely number in ArrayList
     * You are given an integer arraylist nums. A number x is lonely when it appears
     * only once,and no adjecent numbers (i.e. x+1and x-1) appear in the arraylist
     * Return all lonely numbers in nums. You may return the answer in any order.
     * sample input: NUMS=[10,6,5,8]
     * SAMPLE Output [10,8]
     * Explanation:
     * - 10 is a lonely number since it appears exactly once and 9 and 11 does not
     * appear in nums.
     * - 8 is a lonely number since it appears exactly once and 7 and 9 does not
     * appear in nums
     * -5 is not a lonely number since 6 appears in nums and vice versa.Hence, the
     * lonely numbers in nums are [10, 8].Note that [8, 10] may also be returned
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(alone(list));
    }

    static ArrayList<Integer> alone(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                ans.add(list.get(i));
            }
        }
        if (list.size() == 1) {
            ans.add(list.get(0));
        }
        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                ans.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                ans.add(list.get(list.size() - 1));
            }
        }
        return ans;
    }

}
