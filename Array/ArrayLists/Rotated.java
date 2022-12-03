package Array.ArrayLists;

import java.util.ArrayList;

public class Rotated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        System.out.println(PSum(list, 25));
    }

    static boolean PSum(ArrayList<Integer> list, int target) {
        int bp = 0;
        int n = list.size();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;

            } else {
                lp = (lp + 1) % n;
            }
        }
        return false;
    }
}
