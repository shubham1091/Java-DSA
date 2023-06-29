package Alpha.ArrayLists;

import java.util.ArrayList;

public class Monotonic {
    /*
     * Monotonic ArraList
     * An Arraylist is monotonic if it is either monotone increasing
     * or monotonic decreasing
     * An Arraylist nums is monotone increasing if for all
     * i<=j,nums.get(i)<=nums.get(j)
     * An Arraylist nums is monotone decreasing if for all
     * i<=j,nums.get(i)>=nums.get(j)
     * 
     * Given an integer Arraylist nums, return true if the given list
     * is monotonic,or false otherwise
     * SAMPLE INPUT nums=[1,2,2,3]
     * SAMPLE OUTPUT true
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(6);
        System.out.println(isMonotonic(list));
    }

    static boolean isMonotonic(ArrayList<Integer> list) {
        boolean dec = true;
        boolean inc = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
        }
        return dec || inc;
    }

}
