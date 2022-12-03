package Arrays.ArrayLists;

import java.util.ArrayList;

public class Water {
    /*
     * Container with most water
     * For given n lines on x-axis, use 2 lines to form a container
     * such that it holds maximum water.
     * Height = [1,8,6,2,5,4,8,3,7 ]
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
    }

    static int Bruteforce(ArrayList<Integer> hight) {
        // Time complexity O(n^2)
        int max = 0;
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int ht = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int crr = ht * width;
                max = Math.max(max, crr);
            }
        }
        return max;
    }

    // 2 Pointer Approach
    static int storeWater(ArrayList<Integer> hight) {
        // Time complexity O(n)
        int max = 0;
        int lp = 0;
        int rp = hight.size() - 1;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(hight.get(lp), hight.get(rp));
            int width = rp - lp;
            int crr = ht * width;
            max = Math.max(max, crr);
            // update ptr
            if (hight.get(lp) < hight.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

}
