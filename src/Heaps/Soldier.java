package Heaps;

import java.util.PriorityQueue;

public class Soldier {
    /*
     * Weakest Soldier
     * We are given a mXn binary matrix of 1's (soldiers) and 0's (civilians)
     * The soldiers are positioned in front of the civilians. That is, all the
     * 1's will appear to the left of all the 0's in each row.
     * 
     * A row i is weaker than a row j if one of the following is true:
     * 1. The number of soldiers in row i is less then the number of
     * soldiers in row j.
     * 2. Both rows have the same number of soldiers and i<j.
     * 
     * Find the K weakest rows.
     * 
     * m=4 , n=4, k=2
     * 1,0,0,0
     * 1,1,1,1
     * 1,0,0,0
     * 1,0,0,0
     * 
     * ans = row 0 & 2
     */
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row o) {
            if (this.soldiers == o.soldiers) {
                return this.idx - o.idx;
            } else {
                return this.soldiers - o.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int[][] army = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> q = new PriorityQueue<Row>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            q.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + q.remove().idx);
        }

    }
}
