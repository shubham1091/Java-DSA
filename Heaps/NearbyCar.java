package Heaps;

import java.util.PriorityQueue;

public class NearbyCar {
    /*
     * Nearby car
     * We are given N points in a 2D plane which are location on N
     * cars. If we are at the origin, print the nearest K cars
     * C0(3,3)
     * C1(5,-1)
     * C2(-2,4)
     * K=2
     * ans = C0 & C2
     */
    static class Point implements Comparable<Point> {
        int x, y, idx;
        double dis;

        public Point(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            this.idx = idx;
            double d = Math.pow(this.x, 2) + Math.pow(this.y, 2);
            this.dis = Math.sqrt(d);
        }

        @Override
        public int compareTo(Point o) {
            return (int) ((int) this.dis - o.dis);
        }

        @Override
        public String toString() {
            return this.idx + "";
        }
    }

    public static void main(String[] args) {
        int[][] pts = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> q = new PriorityQueue<Point>();
        for (int i = 0; i < pts.length; i++) {
            q.add(new Point(pts[i][0], pts[i][1], i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C" + q.remove());
        }
    }

}
