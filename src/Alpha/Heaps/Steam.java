package Alpha.Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Steam {
    /*
     * K'th largest element in a stream
     * We have an infinite stream of integers, find the K'th
     * largest element at any point of time
     * input
     * steam[]={10,20,11,70,50,40,100,5,....}k=3
     * output
     * {_,_,10,11,20,40,50,50,...}
     */
    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (min.size() < k)
                min.add(val);
            else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }
            if (min.size() >= k)
                list.add(min.peek());
            else
                list.add(-1);
        }
        return list;

    }

    public static void main(String[] args) {
        min = new PriorityQueue<>();
        k = 4;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        List<Integer> list = getAllKthNumber(arr);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
