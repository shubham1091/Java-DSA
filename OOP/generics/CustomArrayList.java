package OOP.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 1;
    private int SIZE = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[SIZE++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--SIZE];
        return removed;
    }

    public int get(int idx) {
        return data[idx];
    }

    public int size() {
        return SIZE;
    }

    public void set(int idx, int val) {
        data[idx] = val;
    }

    private boolean isFull() {
        return SIZE == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList {" + "data = " + Arrays.toString(data) + ", size =" + SIZE + "}";
    }

   

}
