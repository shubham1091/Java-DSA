package OOP.generics;

import java.util.Arrays;

public class GenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 1;
    private int SIZE = 0;

    public GenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[SIZE++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @SuppressWarnings("unchecked")
    // this is just to get rid of type safety warning
    public T remove() {
        T removed = (T) (data[--SIZE]);
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int idx) {
        return (T) (data[idx]);
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
        return "GenArrayList {" + "data = " + Arrays.toString(data) + ", size =" + SIZE + "}";
    }


}
