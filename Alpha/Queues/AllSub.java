package Alpha.Queues;

import java.util.Vector;

public class AllSub {
    /*
     * Maximum of all subarrays of size k
     * we have an darray arr[] of size N and an integer k .find the
     * maximum for each and every contiguius subarray of size k
     * input : N = 9, K = 3 arr = 1 2 3 1 4 5 2 3 6
     * optput : 3 3 4 5 5 5 5 6
     */
    static class cell {
        int x, y;
        int dis;

        public cell(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    public static void main(String[] args) {
        int N = 30;
        int kpos[] = { 1, 1 };
        int tpos[] = { 30, 30 };
        System.out.println(minStep(kpos, tpos, N));
    }

    static boolean isInside(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) {
            return true;
        }
        return false;
    }

    static int minStep(int[] kpos, int[] tpos, int N) {
        int[] dx = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int[] dy = { -1, -2, -2, -1, 1, 2, 2, 1 };

        Vector<cell> q = new Vector<cell>();
        q.add(new cell(kpos[0], kpos[0], 0));
        cell t;
        int x, y;
        boolean visit[][] = new boolean[N + 1][N + 1];
        visit[kpos[0]][kpos[1]] = true;
        while (!q.isEmpty()) {
            t = q.firstElement();
            q.remove(0);
            if (t.x == tpos[0] && t.y == tpos[1]) {
                return t.dis;
            }
            for (int i = 0; i < 8; i++) {
                x = t.x + dx[i];
                y = t.y + dy[i];
                if (isInside(x, y, N) && !visit[x][y]) {
                    visit[x][y] = true;
                    q.add(new cell(x, y, t.dis + 1));
                }
            }
        }
        return Integer.MAX_VALUE;

    }

}
