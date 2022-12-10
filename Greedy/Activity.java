package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity {
    /*
     * Activity selection
     * You are given n acivities with their start and end times.
     * Select the maximum numbr of activities that can be perofrmed
     * by a single person assuming that a person can only work a single
     * acivity at a time. Activities are sorted according to end time.
     * start =[10,12,20]
     * end = [ 20,25,30]
     * ans = 2(AO & A2)
     */
    public static void main(String[] args) {
        int[] st = { 1, 3, 0, 5, 8, 5 };
        int[] en = { 2, 4, 6, 7, 9, 9 };

        System.out.println(mostEnd(st, en));
        mostStart(st, en);
    }

    // sorted according to end time
    private static int mostEnd(int[] st, int[] en) {
        int i = 0, j = 0, count = 0;
        while (i < en.length) {
            while (j < st.length) {
                if (st[j] >= en[i]) {
                    break;
                }
                j++;
            }
            count++;
            i = j;
        }
        return count;
    }

    // sorted according to start time
    private static void mostStart(int[] st, int[] en) {
        /*
         * if sorted on the base of stat time
         * then we have to sort them based on
         * end time
         */
        int arr[][] = new int[en.length][3];
        for (int i = 0; i < en.length; i++) {
            arr[i][0] = i;
            arr[i][1] = st[i];
            arr[i][2] = en[i];
        }
        // lambda function -> shortform
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        int mx = 0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(arr[0][0]);
        int last = arr[0][2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] >= last) {
                mx++;
                ls.add(arr[i][0]);
                last = arr[i][2];
            }
        }
        System.out.println("max activities = " + mx);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print("A" + ls.get(i) + " ");
        }
        System.out.println();
    }

}
