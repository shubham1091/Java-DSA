package Heaps;

import java.util.ArrayList;

public class HP {
    // min heap
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
        // add at last idx
        arr.add(data);

        int x = arr.size() - 1;// x is child index
        int par = (x - 1) / 2;// parent index

        while (arr.get(x) < arr.get(par)) {
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            x = par;
            par = (x - 1) / 2;
        }
    }

    public int peek() {
        return arr.get(0);
    }

    public int remove() {
        int data = arr.get(0);
        // step1 - swap first & last
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // setp2 - delete last
        arr.remove(arr.size() - 1);

        // step3 - hepify
        heapify(0);
        return data;

    }

    private void heapify(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int minIdx = idx;
        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }
        if (minIdx != idx) {
            // swap
            int temp = arr.get(idx);
            arr.set(idx, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }
}
