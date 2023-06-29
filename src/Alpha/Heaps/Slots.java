package Alpha.Heaps;

import java.util.LinkedList;
import java.util.Queue;

public class Slots {
    /*
     * Minimum time required to fill given N slots
     * We have an integer N which denotes the number of slots,
     * and and array arr[] consisting of k integers in the range [1,N]
     * repreand. Each element of the array are in the rang e [1,N]
     * which represents the indices of the filled slots. At each
     * unit of teme, the index with filled slot fills the adjacent
     * empty adjacent empty slots. The task is to find the minimum
     * time taken to fill all the N slots
     * input: N=5; K=5;arr[]={1,2,3,4,5}
     * output: 1
     * input: N6;k=2;arr[={2,6}]
     * output: 2
     */
    public static void minTime(int arr[], int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[N + 1];
        int time = 0;
        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }
        while (q.size() > 0) {
            for (int i = 0; i < q.size(); i++) {
                int curr = q.poll();
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }
                if (curr + 1 <= N && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time++;
        }
        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = { 2, 6 };
        int K = arr.length;
        minTime(arr, N, K);

    }

}
